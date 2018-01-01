package android.musicsigner.android.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.musicsigner.android.R;
import android.musicsigner.android.resources.SignUpRequest.SignUpRequest;
import android.musicsigner.android.resources.SignUpRequest.SignUpResponse;
import android.musicsigner.android.resources.SignUpRequest.SignUpService;
import android.musicsigner.android.utils.AppConstants;
import android.musicsigner.android.utils.Prefs;
import android.musicsigner.android.utils.Utility;
import android.musicsigner.android.web.BaseApiCallback;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.editsoft.api.exception.APIException;

/**
 * Created by gaurav.pandey on 27-12-2017.
 */

public class SignUpActivity extends BaseActivity {
    EditText etUserName;
    EditText etUserEmail;
    EditText etUserPass1;
    EditText etUserPass2;
    TextView btnUserSignup;
    ImageView imageViewShowPassword;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initialization();
        setUpElements();

    }


    private void initialization() {
        etUserName = findViewById(R.id.et_user_name);
        etUserEmail = findViewById(R.id.et_user_email);
        etUserPass1 = findViewById(R.id.et_user_pass1);
        etUserPass2 = findViewById(R.id.et_user_pass2);
        imageViewShowPassword = findViewById(R.id.imageViewShowPassword);
        btnUserSignup = findViewById(R.id.btn_user_signup);
    }

    @SuppressLint("ClickableViewAccessibility")
    private void setUpElements() {
        btnUserSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etUserName.getText().toString();
                String email = etUserEmail.getText().toString();
                String pass1 = etUserPass1.getText().toString();
                String pass2 = etUserPass2.getText().toString();
                if (validateDetails(name, email, pass1, pass2)) {
                    if (!Utility.isConnected()) {
                        Utility.showToast(R.string.msg_disconnected);
                    } else {
                        ((BaseActivity) mContext).showProgress();
                        signUpService(name, email, pass1);
                    }
                }
            }
        });

        imageViewShowPassword.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_UP:
                        etUserPass1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        break;
                    case MotionEvent.ACTION_DOWN:
                        etUserPass1.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;
                }
                return true;
            }
        });

    }


    public void signUpService(String name, String email, String password) {
        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setName(name);
        signUpRequest.setEmail(email);
        signUpRequest.setPassword(password);
        signUpRequest.setGcmId("123456789");
        signUpRequest.setLoginType(AppConstants.MANUAL_LOGIN);
        SignUpService signUpService = new SignUpService();
        signUpService.executeService(signUpRequest, new BaseApiCallback<SignUpResponse>() {
            @Override
            public void onComplete() {
                ((BaseActivity)mContext).dismissProgress();
            }

            @Override
            public void onSuccess(@NonNull SignUpResponse response) {
                super.onSuccess(response);
                if (response.getStatus().getCode() == 200) {
                    SignUpResponse.DataBean data = response.getData();
                    Prefs.putStringPrefs(AppConstants.USER_ID, String.valueOf(data.getId()));
                    Prefs.putStringPrefs(AppConstants.EMAIL, data.getEmail());
                    Prefs.putStringPrefs(AppConstants.PROFILE_PIC, data.getUserImageUrl());
                    Prefs.putStringPrefs(AppConstants.NAME, data.getName());
                    Prefs.putStringPrefs(AppConstants.TOKEN_ID, AppConstants.BEARER + data.getToken());
                    Prefs.putBooleanPrefs(AppConstants.STATUS, true);
                    mContext.startActivity(new Intent(mContext, MainActivity.class));
                    finish();
                } else {
                    Utility.showToast(response.getStatus().getDescription());
                }
            }

            @Override
            public void onFailure(APIException e) {
                super.onFailure(e);
            }
        });
    }

    private boolean validateDetails(String name, String email, String pass1, String pass2) {
        if (!Utility.validateString(name)) {
            Utility.showToast(R.string.msg_enter_name);
            return false;
        } else if (name.length() < 4) {
            Utility.showToast(R.string.msg_short_name);
            return false;
        } else if (!Utility.validateString(email)) {
            Utility.showToast(R.string.msg_enter_email);
            return false;
        } else if (!Utility.validateEmail(email)) {
            Utility.showToast(R.string.msg_email_error);
            return false;
        } else if (!Utility.validateString(pass1)) {
            Utility.showToast(R.string.msg_enter_pass1);
            return false;
        } else if (pass1.length() < 6) {
            Utility.showToast(R.string.msg_pass_error);
            return false;
        } else if (!pass1.equals(pass2)) {
            Utility.showToast(R.string.msg_pass_match);
            return false;
        } else {
            return true;
        }
    }


}

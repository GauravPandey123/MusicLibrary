package android.musicsigner.android.activity;

import android.content.Intent;
import android.musicsigner.android.R;
import android.musicsigner.android.resources.SignUpRequest.Login.LoginRequest;
import android.musicsigner.android.resources.SignUpRequest.Login.LoginResponse;
import android.musicsigner.android.resources.SignUpRequest.Login.LoginService;
import android.musicsigner.android.utils.AppConstants;
import android.musicsigner.android.utils.Prefs;
import android.musicsigner.android.utils.Utility;
import android.musicsigner.android.web.BaseApiCallback;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.editsoft.api.exception.APIException;

/**
 * Created by Gaurav Pandey on 30-12-2017.
 */

public class LoginActivity extends BaseActivity {

    @BindView(R.id.et_user_email)
    EditText etUserEmail;
    @BindView(R.id.et_user_pass)
    EditText etUserPass;
    @BindView(R.id.imageViewShowPassword)
    ImageView imageViewShowPassword;
    @BindView(R.id.btn_user_login)
    TextView btnUserLogin;
    @BindView(R.id.textViewSignUp)
    TextView textViewSignUp;
    @BindView(R.id.textViewForgotPassword)
    TextView textViewForgotPassword;
    @BindView(R.id.iv_login_linkedin)
    ImageView ivLoginLinkedin;
    @BindView(R.id.iv_login_facebook)
    ImageView ivLoginFacebook;
    @BindView(R.id.iv_login_google)
    ImageView ivLoginGoogle;
    @BindView(R.id.iv_login_instagram)
    ImageView ivLoginInstagram;
    @BindView(R.id.btn_user_signup)
    Button btnUserSignup;
    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     
        ButterKnife.bind(this);
        initialization();
        setUpElemnets();

    }

    private void setUpElemnets() {
        btnUserSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etUserEmail.getText().toString();
                String pass = etUserPass.getText().toString();
                if (validateDetails(email, pass)) {
                    if (!Utility.isConnected()) {
                        Utility.showToast(R.string.msg_disconnected);
                    } else {
                        loginService(email, pass);
                    }
                }
            }
        });
    }

    private void initialization() {
    }

    @Override
    public int setLayoutid() {
        return R.layout.fragment_login;
    }

    public void loginService(String email, String pass)
    {
        ((BaseActivity) mContext).showProgress();
        LoginRequest loginRequest=new LoginRequest();
        loginRequest.setEmail(email);
        loginRequest.setPassword(pass);
        loginRequest.setGcmId("1234567890");
        LoginService loginService=new LoginService();
        loginService.executeService(loginRequest, new BaseApiCallback<LoginResponse>() {
            @Override
            public void onComplete() {
                ((BaseActivity) mContext).dismissProgress();
            }

            @Override
            public void onSuccess(@NonNull LoginResponse response) {
                super.onSuccess(response);
                LoginResponse.DataBean data = response.getData();
                Prefs.putStringPrefs(AppConstants.NAME, data.getName());
                Prefs.putStringPrefs(AppConstants.EMAIL, data.getEmail());
                Prefs.putStringPrefs(AppConstants.USER_ID, String.valueOf(data.getId()));
                Prefs.putStringPrefs(AppConstants.TOKEN_ID, AppConstants.BEARER + data.getToken());
                Prefs.putStringPrefs(AppConstants.PROFILE_PIC, data.getUserImageUrl());
                Prefs.putStringPrefs(AppConstants.ADDBIO, data.getBio());
                Prefs.putBooleanPrefs(AppConstants.STATUS, true);
                LoginResponse.DataBean.LinksBean item = data.getLinks();
                if (item != null) {
                    Prefs.putStringPrefs(AppConstants.facebook, item.getFacebook());
                    Prefs.putStringPrefs(AppConstants.twitter, item.getTwitter());
                    Prefs.putStringPrefs(AppConstants.instagram, item.getInstagram());
                    Prefs.putStringPrefs(AppConstants.snapchat, item.getSnapchat());
                    Prefs.putStringPrefs(AppConstants.googleplus, item.getGooglePlus());
                    Prefs.putStringPrefs(AppConstants.tumbler, item.getTumblr());
                    Prefs.putStringPrefs(AppConstants.iTunes, item.getITunes());
                    Prefs.putStringPrefs(AppConstants.spotify, item.getSpotify());
                    Prefs.putStringPrefs(AppConstants.soundcloud, item.getSoundCloud());
                    Prefs.putStringPrefs(AppConstants.reverbnation, item.getReverbNation());
                    Prefs.putStringPrefs(AppConstants.deezer, item.getDeezer());
                    Prefs.putStringPrefs(AppConstants.saavan, item.getSaavn());
                    Prefs.putStringPrefs(AppConstants.gaana, item.getGaana());
                }
                mContext.startActivity(new Intent(mContext, MainActivity.class));
                finish();
            }

            @Override
            public void onFailure(APIException e) {
                super.onFailure(e);
                Utility.showToast(e.getData());
            }
        });
    }
    private boolean validateDetails(String email, String pass) {
        // Utility.hideSoftKeyboard(mA);
        if (!Utility.validateString(email)) {
            Utility.showToast(R.string.msg_enter_email);
            return false;
        } else if (!Utility.validateEmail(email)) {
            Utility.showToast(R.string.msg_email_error);
            return false;
        } else if (!Utility.validateString(pass)) {
            Utility.showToast(R.string.msg_enter_pass1);
            return false;
        } else if (pass.length() < 6) {
            Utility.showToast(R.string.msg_pass_error);
            return false;
        } else {
            return true;
        }
    }
}

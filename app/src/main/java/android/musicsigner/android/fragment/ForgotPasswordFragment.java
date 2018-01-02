package android.musicsigner.android.fragment;

import android.content.Intent;
import android.musicsigner.android.R;
import android.musicsigner.android.activity.BaseActivity;
import android.musicsigner.android.activity.LoginActivity;
import android.musicsigner.android.resources.SignUpRequest.ForgotPassword.GetOtpRequest;
import android.musicsigner.android.resources.SignUpRequest.ForgotPassword.GetOtpResponse;
import android.musicsigner.android.resources.SignUpRequest.ForgotPassword.GetOtpService;
import android.musicsigner.android.resources.SignUpRequest.ResetPassword.VerifyOtpRequest;
import android.musicsigner.android.resources.SignUpRequest.ResetPassword.VerifyOtpResponse;
import android.musicsigner.android.resources.SignUpRequest.ResetPassword.VerifyOtpService;
import android.musicsigner.android.utils.Utility;
import android.musicsigner.android.web.BaseApiCallback;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import in.editsoft.api.exception.APIException;

/**
 * Created by Gaurav Pandey on 31-12-2017.
 */

public class ForgotPasswordFragment extends BaseFragment {
    View view;

    Unbinder unbinder;

    private String mEmail;

    // Declare all views here
    LinearLayout llEnterEmail;
    EditText etUserEmail;
    TextView btnSendEmail;
    LinearLayout llResetPass;
    RelativeLayout linearLayout;
    EditText etUserOtp;
    EditText etUserPass1;
    EditText etUserPass2;
    TextView btnResetPass;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pro_pass_forgot, container, false);
        unbinder = ButterKnife.bind(this, view);
        setUpViews();
        intialization();
        setUpElements();
        return view;
    }

    private void setUpViews() {
        linearLayout = view.findViewById(R.id.linearLayout);
        llEnterEmail = view.findViewById(R.id.ll_enter_email);
        etUserEmail = view.findViewById(R.id.et_user_email);
        btnSendEmail = view.findViewById(R.id.btn_send_email);
        llResetPass = view.findViewById(R.id.ll_reset_pass);
        etUserOtp = view.findViewById(R.id.et_user_otp);
        etUserPass1 = view.findViewById(R.id.et_user_pass1);
        etUserPass2 = view.findViewById(R.id.et_user_pass2);
        btnResetPass = view.findViewById(R.id.btn_reset_pass);

    }

    @Override
    public void onStart() {
        super.onStart();
        mContext = getActivity();
        setClickListeners();
    }

    private void setClickListeners() {
        btnSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etUserEmail.getText().toString();
                if (validateEmail(email)) {
                    if (!Utility.isConnected()) {
                        Utility.showToast(R.string.msg_disconnected);
                    } else {
                        mEmail = email;
                        submitOtpRequest();
                    }
                }
            }
        });


        btnResetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String otp = etUserOtp.getText().toString();
                String pass1 = etUserPass1.getText().toString();
                String pass2 = etUserPass2.getText().toString();
                if (validateDetails(otp, pass1, pass2)) {
                    if (!Utility.isConnected()) {
                        Utility.showToast(R.string.msg_disconnected);
                    } else {
                        submitPasswordRequest(otp, pass1);
                    }
                }
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utility.hideSoftKeyboard(getActivity());
            }
        });
    }
    private void submitOtpRequest() {
        ((BaseActivity) mContext).showProgress();
        GetOtpRequest getOtpRequest = new GetOtpRequest();
        getOtpRequest.setEmail(mEmail);
        GetOtpService getOtpService = new GetOtpService();
        getOtpService.executeService(getOtpRequest, new BaseApiCallback<GetOtpResponse>() {
            @Override
            public void onComplete() {
                ((BaseActivity) mContext).dismissProgress();
            }

            @Override
            public void onSuccess(@NonNull GetOtpResponse response) {
                super.onSuccess(response);
                if (response.getStatus().getCode() == 200) {
                    llEnterEmail.setVisibility(View.GONE);
                    llResetPass.setVisibility(View.VISIBLE);
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




    private void setUpElements() {


    }

    private void intialization() {


    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    public void GetOtpCalls(String mEmail) {
        ((BaseActivity) mContext).showProgress();
        GetOtpRequest getOtpRequest = new GetOtpRequest();
        getOtpRequest.setEmail(mEmail);
        GetOtpService getOtpService = new GetOtpService();
        getOtpService.executeService(getOtpRequest, new BaseApiCallback<GetOtpResponse>() {
            @Override
            public void onComplete() {
                ((BaseActivity) mContext).dismissProgress();
            }

            @Override
            public void onSuccess(@NonNull GetOtpResponse response) {
                super.onSuccess(response);
                if (response.getStatus().getCode() == 200) {
                    llEnterEmail.setVisibility(View.GONE);
                    llResetPass.setVisibility(View.VISIBLE);
                } else {
                    Utility.showToast(response.getStatus().getDescription());
                }
            }

            @Override
            public void onFailure(APIException e) {
                super.onFailure(e);
                Utility.showToast(e.getData());
            }
        });

    }

    private void submitPasswordRequest(String otp, String pass) {
        ((BaseActivity) mContext).showProgress();
        VerifyOtpRequest verifyOtpRequest = new VerifyOtpRequest();
        verifyOtpRequest.setEmail(mEmail);
        verifyOtpRequest.setOtp(otp);
        verifyOtpRequest.setPassword(pass);
        VerifyOtpService verifyOtpService = new VerifyOtpService();
        verifyOtpService.executeService(verifyOtpRequest, new BaseApiCallback<VerifyOtpResponse>() {
            @Override
            public void onComplete() {
                ((BaseActivity) mContext).dismissProgress();
            }

            @Override
            public void onSuccess(@NonNull VerifyOtpResponse response) {
                super.onSuccess(response);
                if (response.getStatus().getCode() == 200) {
                    Utility.showToast(response.getStatus().getDescription());
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                    getActivity().finish();

                } else {
                    Utility.showToast(response.getStatus().getDescription());
                }
            }

            @Override
            public void onFailure(APIException e) {
                super.onFailure(e);
                Utility.showToast(e.getData());
            }
        });
    }


    private boolean validateDetails(String otp, String pass1, String pass2) {
        Utility.hideSoftKeyboard(getActivity());
        if (!Utility.validateString(otp)) {
            Utility.showToast(R.string.msg_enter_otp);
            return false;
        } else if (otp.length() < 6) {
            Utility.showToast(R.string.msg_short_otp);
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

    private boolean validateEmail(String email) {
        Utility.hideSoftKeyboard(getActivity());
        if (!Utility.validateString(email)) {
            Utility.showToast(R.string.msg_enter_email);
            return false;
        } else if (!Utility.validateEmail(email)) {
            Utility.showToast(R.string.msg_email_error);
            return false;
        } else {
            return true;
        }
    }
}

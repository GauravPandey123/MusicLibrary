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
    @BindView(R.id.et_user_email)
    EditText etUserEmail;
    @BindView(R.id.btn_send_email)
    TextView btnSendEmail;
    @BindView(R.id.ll_enter_email)
    LinearLayout llEnterEmail;
    @BindView(R.id.et_user_otp)
    EditText etUserOtp;
    @BindView(R.id.et_user_pass1)
    EditText etUserPass1;
    @BindView(R.id.et_user_pass2)
    EditText etUserPass2;
    @BindView(R.id.btn_reset_pass)
    TextView btnResetPass;
    @BindView(R.id.ll_reset_pass)
    LinearLayout llResetPass;
    @BindView(R.id.linearLayout)
    RelativeLayout linearLayout;
    Unbinder unbinder;

    private String mEmail;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pro_pass_forgot, container, false);
        unbinder = ButterKnife.bind(this, view);
        intialization();
        setUpElements();
        return view;
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

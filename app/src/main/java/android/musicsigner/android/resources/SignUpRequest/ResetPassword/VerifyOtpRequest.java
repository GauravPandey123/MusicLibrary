package android.musicsigner.android.resources.SignUpRequest.ResetPassword;


import android.musicsigner.android.web.BaseRequest;

/**
 * Created by Editsoft on 12/27/16.
 */

public class VerifyOtpRequest extends BaseRequest {
    /**
     * email : jeevan@editsoft.in
     * password : 12345
     * otp : 470982
     */

    private String email;
    private String password;
    private String otp;

    @Override
    public boolean isValid(String Scenario) {
        return true;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}

package android.musicsigner.android.resources.SignUpRequest.ForgotPassword;


import android.musicsigner.android.web.BaseRequest;

/**
 * Created by Editsoft on 12/27/16.
 */

public class GetOtpRequest extends BaseRequest {
    /**
     * email : jeevan@editsoft.in
     */

    private String email;

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
}

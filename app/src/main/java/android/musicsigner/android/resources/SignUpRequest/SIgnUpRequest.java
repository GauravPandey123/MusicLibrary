package android.musicsigner.android.resources.SignUpRequest;

import android.musicsigner.android.web.BaseRequest;

/**
 * Created by gaurav.pandey on 28-12-2017.
 */

public class SIgnUpRequest extends BaseRequest {
    public String name;
    public String email;
    public String password;
    public String gcmId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String loginType;
    @Override
    public boolean isValid(String Scenario) {
        return true;
    }


}

package android.musicsigner.android.resources.SignUpRequest.ResetPassword;



import android.musicsigner.android.web.BaseService;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Editsoft on 12/27/16.
 */

public class VerifyOtpService extends BaseService<VerifyOtpService.VerifyOtpAPI, VerifyOtpRequest, VerifyOtpResponse> {

    @Override
    public Call<VerifyOtpResponse> onExecute(VerifyOtpAPI api, VerifyOtpRequest request) {
        return api.verifyOtp(request);
    }

    @Override
    public Class<VerifyOtpAPI> getAPI() {
        return VerifyOtpAPI.class;
    }

    public interface VerifyOtpAPI {
        @POST("/api/reset-password")
        Call<VerifyOtpResponse> verifyOtp(@Body VerifyOtpRequest verifyOtpRequest);
    }
}

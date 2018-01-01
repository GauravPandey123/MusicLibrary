package android.musicsigner.android.resources.SignUpRequest.ForgotPassword;



import android.musicsigner.android.web.BaseService;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Editsoft on 12/27/16.
 */

public class GetOtpService extends BaseService<GetOtpService.GetOtpApi, GetOtpRequest, GetOtpResponse> {
    @Override
    public Call<GetOtpResponse> onExecute(GetOtpApi api, GetOtpRequest request) {
        return api.getOtp(request);
    }

    @Override
    public Class<GetOtpApi> getAPI() {
        return GetOtpApi.class;
    }

    public interface GetOtpApi {
        @POST("/api/forgot-password")
        Call<GetOtpResponse> getOtp(@Body GetOtpRequest getOtpRequest);
    }
}

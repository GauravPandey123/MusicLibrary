package android.musicsigner.android.resources.SignUpRequest;



import android.musicsigner.android.web.BaseService;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ANSH on 12/16/2016.
 */

public class SignUpService extends BaseService<SignUpService.SignUpApi, SignUpRequest, SignUpResponse> {


    @Override
    public Call<SignUpResponse> onExecute(SignUpApi api, SignUpRequest request) {
        return api.signUp(request);
    }

    @Override
    public Class<SignUpApi> getAPI() {
        return SignUpApi.class;
    }

    public interface SignUpApi {
        @POST("/api/users")
        Call<SignUpResponse> signUp(@Body SignUpRequest signUpRequest);
    }

}

package android.musicsigner.android.resources.SignUpRequest.Login;



import android.musicsigner.android.web.BaseService;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ANSH on 12/15/2016.
 */

public class LoginService extends BaseService<LoginService.LoginApi, LoginRequest, LoginResponse> {

    @Override
    public Call<LoginResponse> onExecute(LoginApi api, LoginRequest request) {
        return api.login(request);
    }

    @Override
    public Class<LoginApi> getAPI() {
        return LoginApi.class;
    }

    interface LoginApi {
        @POST("/api/authenticate")
        Call<LoginResponse> login(@Body LoginRequest loginRequest);
    }
}

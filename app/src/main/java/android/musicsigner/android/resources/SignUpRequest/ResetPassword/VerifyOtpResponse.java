package android.musicsigner.android.resources.SignUpRequest.ResetPassword;


import android.musicsigner.android.web.BaseResponse;

/**
 * Created by Editsoft on 12/27/16.
 */

public class VerifyOtpResponse extends BaseResponse<VerifyOtpResponse> {
    /**
     * mData : Password reset successfully!
     * status : {"code":200,"description":"Password reset successfully"}
     */

    private String data;
    private StatusBean status;

    @Override
    public boolean isValid(String condition, boolean isStrict) {
        return true;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }


    public static class StatusBean {
        /**
         * code : 200
         * description : Password reset successfully
         */

        private int code;
        private String description;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

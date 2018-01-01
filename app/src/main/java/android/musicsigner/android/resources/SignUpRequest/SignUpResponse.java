package android.musicsigner.android.resources.SignUpRequest;


import android.musicsigner.android.web.BaseResponse;

/**
 * Created by ANSH on 12/16/2016.
 */

public class SignUpResponse extends BaseResponse<SignUpResponse> {
    @Override
    public boolean isValid(String condition, boolean isStrict) {
        return true;
    }

    /**
     * mData : {"id":61,"name":"Manoj Singh Rawat","email":"pavnish@editsoft.in","imageId":null,"userImageUrl":null,"followerCount":0,"followingCount":0,"postCount":0,"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjYxLCJpc3MiOiJodHRwOlwvXC9tdWR6aWMuZWRpdHNvZnRuZXJkcy5jb21cL2FwaVwvdXNlcnMiLCJpYXQiOjE0ODI4MzMzMTAsImV4cCI6MTUxNDM2OTMxMCwibmJmIjoxNDgyODMzMzEwLCJqdGkiOiJlMDcwYzFlNjM4NWQxMjQwN2Y4MDkzODdlMmE1MGUwMiJ9.TI7Hdyjf70X8TVv2Sy63BKGn2ZI82rcpcU2bShIluB0"}
     * status : {"code":200,"description":"Success"}
     */

    private DataBean data;
    private StatusBean status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * id : 61
         * name : Manoj Singh Rawat
         * email : pavnish@editsoft.in
         * imageId : null
         * userImageUrl : null
         * followerCount : 0
         * followingCount : 0
         * postCount : 0
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjYxLCJpc3MiOiJodHRwOlwvXC9tdWR6aWMuZWRpdHNvZnRuZXJkcy5jb21cL2FwaVwvdXNlcnMiLCJpYXQiOjE0ODI4MzMzMTAsImV4cCI6MTUxNDM2OTMxMCwibmJmIjoxNDgyODMzMzEwLCJqdGkiOiJlMDcwYzFlNjM4NWQxMjQwN2Y4MDkzODdlMmE1MGUwMiJ9.TI7Hdyjf70X8TVv2Sy63BKGn2ZI82rcpcU2bShIluB0
         */

        private int id;
        private String name;
        private String email;
        private int imageId;
        private String userImageUrl;
        private int followerCount;
        private int followingCount;
        private int postCount;
        private String token;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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

        public int getImageId() {
            return imageId;
        }

        public void setImageId(int imageId) {
            this.imageId = imageId;
        }

        public String getUserImageUrl() {
            return userImageUrl;
        }

        public void setUserImageUrl(String userImageUrl) {
            this.userImageUrl = userImageUrl;
        }

        public int getFollowerCount() {
            return followerCount;
        }

        public void setFollowerCount(int followerCount) {
            this.followerCount = followerCount;
        }

        public int getFollowingCount() {
            return followingCount;
        }

        public void setFollowingCount(int followingCount) {
            this.followingCount = followingCount;
        }

        public int getPostCount() {
            return postCount;
        }

        public void setPostCount(int postCount) {
            this.postCount = postCount;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static class StatusBean {
        /**
         * code : 200
         * description : Success
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

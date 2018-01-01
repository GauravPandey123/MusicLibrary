package android.musicsigner.android.resources.SignUpRequest.Login;


import android.musicsigner.android.web.BaseResponse;

/**
 * Created by ANSH on 12/15/2016.
 */

public class LoginResponse extends BaseResponse<LoginResponse> {


    /**
     * data : {"id":8,"name":"Gaurav","email":"gaurav@editsoft.in","imageId":null,"gender":"male","bio":"I MSR","userImageUrl":null,"followerCount":0,"followingCount":4,"postCount":0,"isActive":1,"links":{"id":3,"userId":8,"iTunes":null,"spotify":"","soundCloud":"","reverbNation":"","deezer":"","tidal":"","saavn":"","gaana":"","facebook":"Bsbsh","instagram":"","twitter":"","snapchat":"","googlePlus":null,"tumblr":null},"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjgsImlzcyI6Imh0dHA6XC9cL2Rld"}
     */

    private DataBean data;

    @Override
    public boolean isValid(String condition, boolean isStrict) {
        return true;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }


    public static class DataBean {
        /**
         * id : 8
         * name : Gaurav
         * email : gaurav@editsoft.in
         * imageId : null
         * gender : male
         * bio : I MSR
         * userImageUrl : null
         * followerCount : 0
         * followingCount : 4
         * postCount : 0
         * isActive : 1
         * links : {"id":3,"userId":8,"iTunes":null,"spotify":"","soundCloud":"","reverbNation":"","deezer":"","tidal":"","saavn":"","gaana":"","facebook":"Bsbsh","instagram":"","twitter":"","snapchat":"","googlePlus":null,"tumblr":null}
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjgsImlzcyI6Imh0dHA6XC9cL2Rld
         */

        private int id;
        private String name;
        private String email;
        private String imageId;
        private String gender;
        private String bio;
        private String userImageUrl;
        private int followerCount;
        private int followingCount;
        private int postCount;
        private int isActive;
        private LinksBean links;
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

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
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

        public int getIsActive() {
            return isActive;
        }

        public void setIsActive(int isActive) {
            this.isActive = isActive;
        }

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
            this.links = links;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class LinksBean {
            /**
             * id : 3
             * userId : 8
             * iTunes : null
             * spotify :
             * soundCloud :
             * reverbNation :
             * deezer :
             * tidal :
             * saavn :
             * gaana :
             * facebook : Bsbsh
             * instagram :
             * twitter :
             * snapchat :
             * googlePlus : null
             * tumblr : null
             */

            private int id;
            private int userId;
            private String iTunes;
            private String spotify;
            private String soundCloud;
            private String reverbNation;
            private String deezer;
            private String tidal;
            private String saavn;
            private String gaana;
            private String facebook;
            private String instagram;
            private String twitter;
            private String snapchat;
            private String googlePlus;
            private String tumblr;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getITunes() {
                return iTunes;
            }

            public void setITunes(String iTunes) {
                this.iTunes = iTunes;
            }

            public String getSpotify() {
                return spotify;
            }

            public void setSpotify(String spotify) {
                this.spotify = spotify;
            }

            public String getSoundCloud() {
                return soundCloud;
            }

            public void setSoundCloud(String soundCloud) {
                this.soundCloud = soundCloud;
            }

            public String getReverbNation() {
                return reverbNation;
            }

            public void setReverbNation(String reverbNation) {
                this.reverbNation = reverbNation;
            }

            public String getDeezer() {
                return deezer;
            }

            public void setDeezer(String deezer) {
                this.deezer = deezer;
            }

            public String getTidal() {
                return tidal;
            }

            public void setTidal(String tidal) {
                this.tidal = tidal;
            }

            public String getSaavn() {
                return saavn;
            }

            public void setSaavn(String saavn) {
                this.saavn = saavn;
            }

            public String getGaana() {
                return gaana;
            }

            public void setGaana(String gaana) {
                this.gaana = gaana;
            }

            public String getFacebook() {
                return facebook;
            }

            public void setFacebook(String facebook) {
                this.facebook = facebook;
            }

            public String getInstagram() {
                return instagram;
            }

            public void setInstagram(String instagram) {
                this.instagram = instagram;
            }

            public String getTwitter() {
                return twitter;
            }

            public void setTwitter(String twitter) {
                this.twitter = twitter;
            }

            public String getSnapchat() {
                return snapchat;
            }

            public void setSnapchat(String snapchat) {
                this.snapchat = snapchat;
            }

            public String getGooglePlus() {
                return googlePlus;
            }

            public void setGooglePlus(String googlePlus) {
                this.googlePlus = googlePlus;
            }

            public String getTumblr() {
                return tumblr;
            }

            public void setTumblr(String tumblr) {
                this.tumblr = tumblr;
            }
        }
    }
}
package android.musicsigner.android.utils;

/**
 * Created by Gaurav Pandey on 30-12-2017.
 */

public class AppConstants {

    private static final String TAG = AppConstants.class.getSimpleName();
    public static final int GRID_ITEM = 3;
    public static final int LIST_ITEMS_COUNT = 10;
    public static final int GRID_ITEMS_COUNT = 15;
    public static final int PAGEING_THRESHOLD = 5;
    public static final String UPDATE_POST = "UpdatePost";
    public static final String POST_VALUES = "PostValues";
    public static final String PROFILE_DATA = "profile_data";
    public static final String SOCIAL_MUSICDATA = "social_data";
    public static final String REPORT_TITLE = "report_title";
    public static final String MANUAL_LOGIN = "Manual Login";
    public static final String SETTINGS_WEB_URL = "WebUrl";
    public static final String EXPLORE_LIST_PAGE = "ListData";
    public static final String EXPLORE_LIST_ITEM = "Position";
    public static final String EXPLORE_LIST_VALUES = "ListItems";
    public static final String PROFILE_CHECK = "ProfileCheck";
    public static final String PROFILE_POSTS = "ProfilePosts";
    public static final String PROFILE_ISUSER = "ProfileIsUser";
    public static final String PROFILE_USERID = "ProfileUserId";
    public static final String SEARCH_TAG = "SearchTags";
    public static final String ITEM_LIST = "ItemList";
    public static final String POINT_X = "PointX";
    public static final String POINT_Y = "Point";
    public static final String VIEW_TYPE = "ProfileType";
    public static final String Notification_type = "Notification_type";
    public static final String IMAGE_NAME = "MudzicImage";
    public static final String CPOST_TYPE = "PostType";
    public static final String CPOST_ID = "PostId";
    public static final String COMMENT_ALL = "AllComments";
    public static final String COMMENT_POST = "ViewComments";
    public static final String PROFILE_TAG = "UserDetailTagClick";
    public static final long RETRY_DELAY = 1000;
    //itunes data
    public static final String PREVIEWURL = "previewUrl";
    public static final String ARTWORKURL = "artworkUrl";
    public static final String isITUNES = "isITUNES";
    public static final String isIunesHashTag = "hashtag";
    public static final String SONG_TIME = "songtime";
    public static final String TRACK_URL = "trackurl";
    public static final String AUTHOR = "iAuthor";
    public static final String TITLE = "iTitle";
    public static final String APPLE = "APPLE";
    public static final String USERS = "USER";
    public static final String ORIGINAL = "original";
    public static final String REHASHED = "rehashed";


    // Explore Search Data
    public static final String SEARCH_TYPE = "SearchType";
    public static final int SEARCH_USER = 0;
    public static final int SEARCH_TOPIC = 1;

    // Music Item Status
    public static final int NOT_PLAYING = 0;
    public static final int BUFFERING = 1;
    public static final int PLAYING = 2;
    public static final int PAUSED = 3;
    public static final int STOPPED = 4;
    public static final int FINISH = 5;

    public static final float ASPECT_RATIO = 0.75f;
    public static final float VIEW_START = 0.3f;
    public static final float VIEW_FINAL = 0.7f;

    // Network Key
    public static final String success = "200";
    public static final String error = "201";
    public static final String TOKEN_KEY = "Authorization";
    public static final String USER_VIEW_ID = "user_view_id";
    public static final String TRUE = "true";
    public static final String USER_ID = "user_id";
    public static final String EMAIL = "email";
    public static final String STATUS = "status";
    public static final String NAME = "name";
    public static final String PROFILE_PIC = "profile_pic";
    public static final String BEARER = "Bearer ";
    public static final String TOKEN_ID = "token_id";
    public static final String POST_ID = "id";
    public static final String TUTORIAL = "Tutorial";
    public static final String isNotification = "isNotification";

    // Notification Values
    public static final String NtfTAG = "TAG";
    public static final String NtfALERT = "ALERT";
    public static final String NtfComment = "COMMENT";
    public static final String NtfLike = "LIKE";
    public static final String NtfFollow = "FOLLOW";
    public static final String text = "text";
    public static final String HomeNotifier = "HomeNotifier";
    public static final String videoBaseUrl = "http://mudzic.com/video";
    public static final String ImageBaseUrl = "http://mudzic.editsoftnerds.com/images/";
    public static final String CommentStatus = "CommentStatus";
    public static final String ADDBIO = "Bio";
    public static final String from = "from";
    public static final String notification = "isNotifcation";

    // Post Tag Data
    public static final String POST_UPDATE = "IsPostUpdate";
    public static final String POST_IMAGE_URL = "PostImageUrl";
    public static final String POST_USER_TAGS = "PostUserTags";

    public static final String HomeType = "HomeType";
    public static final String FollowType = "FollowType";

    private static final String URL_IMAGE_OPTIM = "https://img.gs/ftwwpkfzdp/";
    public static final String WHATSAPP_TEXT = "Hi,\nI've shared a song on Mudzic that I think you'll love to hear too!\n\nCheck it out. To make it easier for you, I've added the app link below:\n\n%s\n\nThanks,\n%s";
    public static final String IMAGE_ID = "imageid";


    public static String CommentText = "CommentText";

    //social data
    public static final String facebook = "facebook";
    public static final String twitter = "twitter";
    public static final String instagram = "instagram";
    public static final String snapchat = "snapchat";
    public static final String googleplus = "googleplus";
    public static final String tumbler = "tumber";

    //music data
    public static final String iTunes = "iTunes";
    public static final String spotify = "spotify";
    public static final String soundcloud = "soundcloud";
    public static final String reverbnation = "reverbnation";
    public static final String deezer = "deezer";
    public static final String tidal = "tidal";
    public static final String saavan = "saavan";
    public static final String gaana = "gaana";

    // Social Share Data
    public static final String PACKAGE_TWITTER = "com.twitter.android";
    public static final String PACKAGE_FACEBOOK = "com.facebook.orca";
    public static final String PACKAGE_WHATSAPP = "com.whatsapp";

    public static final String PACKAGE_FACEBOOK_URL = "com.facebook.katana";
    public static final String PACKAGE_INSTAGRAM_URL = "com.instagram.android";
    public static final String PACKAGE_SNAPCHAT_URL = "com.snapchat.android";
    public static final String PACKAGE_GOOGLE_PLUS_URL = "com.google.android.apps.plus";
    public static final String PACKAGE_TUMBLER = "com.tumblr";

    public static final String PACKAGE_ITUNES_URL = "com.apple.android.music";
    public static final String PACKAGE_SPOTIFY_URL = "com.shazam.android";
    public static final String PACKAGE_SOUNDCLOUD_URL = "com.soundcloud.android";
    public static final String PACKAGE_REVERBNATION_URL = "com.gss.android.ReverbNation.Activities";
    public static final String PACKAGE_DEEZER_URL = "deezer.android.app";
    public static final String PACKAGE_TIDAL_URL = "com.aspiro.tidal";
    public static final String PACKAGE_SAAVN_URL = "com.saavn.android";
    public static final String PACKAGE_GAANA_URL = "com.gaana";


    public static String getLocalSong() {
        return Prefs.getStringPrefs(localSong);
    }

    public static void setLocalSong(String value) {
        Prefs.putStringPrefs(localSong, value);
    }

    public static String getLocalPostImage() {
        return Prefs.getStringPrefs(localPostImage);
    }

    public static void setLocalPostImage(String value) {
        Prefs.putStringPrefs(localPostImage, value);
    }

    public static String getLocalAuthor() {
        return Prefs.getStringPrefs(localAuthor);
    }

    public static void setLocalAuthor(String value) {
        Prefs.putStringPrefs(localAuthor,value);
    }

    public static String getLocalTitle() {
        return Prefs.getStringPrefs(localTitle);
    }

    public static void setLocalTitle(String value) {
        Prefs.putStringPrefs(localTitle,value);
    }

    public static String getLocalMood() {
        return Prefs.getStringPrefs(localMood);
    }

    public static void setLocalMood(String value) {
        Prefs.putStringPrefs(localMood,value);
    }

    public static int getLocalStartAt() {
        return Prefs.getIntegerPrefs(localStartAt);
    }

    public static void setLocalStartAt(int value) {
        Prefs.putIntegerPrefs(localStartAt, value);
    }

    public static int getLocalEndAt() {
        return Prefs.getIntegerPrefs(localEndAt);
    }

    public static void setLocalSongTime(int value) {
        Prefs.putIntegerPrefs(SONG_TIME, value);
    }

    public static int getLocalSongTime() {
        return Prefs.getIntegerPrefs(SONG_TIME);
    }

    public static void setLocalEndAt(int value) {
        Prefs.putIntegerPrefs(localEndAt, value);
    }

    public static String getLocalCaption() {
        return Prefs.getStringPrefs(localCaption);
    }

    public static void setLocalCaption(String value) {
        Prefs.putStringPrefs(localCaption, value);
    }

    public static String getLocalHashTags() {
        return localHashTags;
    }

    public static void setLocalHashTags(String localHashTags) {
        AppConstants.localHashTags = localHashTags;
    }


    private static String localSong = "localSong";
    private static String localPostImage = "localPostImage";
    public static String localAuthor = "localAuthor";
    public static String localTitle = "localTitle";
    public static String localMood = "localMood";
    private static String localStartAt = "localStartAt";
    private static String localEndAt = "localEndAt";
    private static String localCaption = "localCaption";
    private static String localHashTags = "localHashTags";
    private static String isLocal = "isLocal";
    private static String postTypeOriginal = "isPostOriginal";
    private static String postTypeRehashed = "isPostRehashed";


    public static String getLocalPostTypeOriginal() {
        return Prefs.getStringPrefs(postTypeOriginal);
    }

    public static void setLocalPostTypeOriginal(String value) {
        Prefs.putStringPrefs(postTypeOriginal, value);
    }


    public static int getRangeMin() {
        return Prefs.getIntegerPrefs(rangeMin);
    }

    public static void setRangeMin(int value) {
        Prefs.putIntegerPrefs(rangeMin, value);
    }

    public static int getRangeMax() {
        return Prefs.getIntegerPrefs(rangeMax);
    }

    public static void setRangeMax(int value) {
        Prefs.putIntegerPrefs(rangeMax, value);
    }

    public static String rangeMin = "rangeMin";
    public static String rangeMax = "rangeMax";


    public static boolean getIsLocal() {
        return Prefs.getBooleanPrefs(isLocal);
    }

    public static void setIsLocal(boolean value) {
        Prefs.putBooleanPrefs(isLocal, value);
    }

    public static String isBackground = "isBackground";

    public static boolean getIsBackground() {
        return Prefs.getBooleanPrefs(isBackground);
    }

    public static void setIsBackground(boolean value) {
        Prefs.putBooleanPrefs(isBackground, value);
    }

    public static boolean getSelect_Post_type() {
        return Prefs.getBooleanPrefs(Select_Post_type);
    }

    public static void setSelect_Post_type(boolean value) {
        Prefs.putBooleanPrefs(Select_Post_type, value);
    }


    public static String getPreviewUrl() {
        return Prefs.getStringPrefs(PREVIEW_URL);
    }

    public static void setPreviewUrl(String value) {
        Prefs.putStringPrefs(PREVIEW_URL, value);
    }


    public static final String PREVIEW_URL = "PREVIEW_URL";


    public static final String Select_Post_type = "Post_type";

    public static boolean getImageType() {
        return Prefs.getBooleanPrefs(IMAGE_TYPE);
    }

    public static void setImageType(boolean value) {
        Prefs.putBooleanPrefs(IMAGE_TYPE, value);
    }

    private static final String IMAGE_TYPE = "image_type";

    public static boolean getRecordType() {
        return Prefs.getBooleanPrefs(RECORD_TYPE);
    }

    public static void setRecordType(boolean value) {
        Prefs.putBooleanPrefs(RECORD_TYPE, value);
    }


    private static final String RECORD_TYPE = "record_type";

    public static String getType() {
        return type;
    }

    public static void setType(String value) {
        Prefs.putStringPrefs(type, value);
    }

    public static final String type = "type";

    public static void showAllPostData(String methodName){
        android.util.Log.e(TAG, methodName + ": getIsLocal : " + getIsLocal());
        android.util.Log.e(TAG, methodName + ": getLocalSong : " + getLocalSong());
        android.util.Log.e(TAG, methodName + ": getLocalPostImage : " + getLocalPostImage());
        android.util.Log.e(TAG, methodName + ": getLocalStartAt : " + getLocalStartAt());
        android.util.Log.e(TAG, methodName + ": getLocalEndAt : " + getLocalEndAt());
        android.util.Log.e(TAG, methodName + ": getLocalSongTime : " + getLocalSongTime());
        android.util.Log.e(TAG, methodName + ": getLocalPostTypeOriginal: " + getLocalPostTypeOriginal());
        android.util.Log.e(TAG, methodName + ": getType : " + getType());
    }

}

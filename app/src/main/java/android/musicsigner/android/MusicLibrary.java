package android.musicsigner.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.multidex.MultiDex;

import in.editsoft.api.util.App;

/**
 * Created by Gaurav Pandey on 30-12-2017.
 */

public class MusicLibrary extends App {
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    private static final String FRIENDLY_ENGAGE_TOPIC = "friendly_engage";

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}

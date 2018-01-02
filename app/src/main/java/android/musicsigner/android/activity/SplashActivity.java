package android.musicsigner.android.activity;

import android.content.Intent;
import android.musicsigner.android.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gaurav.pandey on 27-12-2017.
 */

public class SplashActivity extends AppCompatActivity {
    private Runnable mRunnable;
    private Handler mHandler = new Handler();
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        };
        mHandler.postDelayed(mRunnable, SPLASH_TIME_OUT);

    }
}

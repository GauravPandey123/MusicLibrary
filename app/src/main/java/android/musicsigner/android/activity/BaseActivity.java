package android.musicsigner.android.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.musicsigner.android.R;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gaurav.pandey on 27-12-2017.
 */

public class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    private ProgressDialog mProgressDialog;
    public boolean isReplaced=false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutid());
        mContext=this;
    }

    public int setLayoutid() {
        return R.layout.activity_main;
    }

    public void addFragment(Fragment fragment, int containerId) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerId, fragment)
                .commitAllowingStateLoss();
    }

    public void replaceFragment(Fragment fragment, int containerId) {
        isReplaced = true;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerId, fragment)
                .commitAllowingStateLoss();
    }


}

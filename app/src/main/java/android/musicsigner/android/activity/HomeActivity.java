package android.musicsigner.android.activity;

import android.musicsigner.android.R;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by gaurav.pandey on 02-01-2018.
 */

public class HomeActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        setUpElements();
    }

    private void initialization() {
    }

    private void setUpElements()
    {

    }
}

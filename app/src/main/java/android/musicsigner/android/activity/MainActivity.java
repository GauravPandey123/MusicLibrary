package android.musicsigner.android.activity;

import android.musicsigner.android.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;
    @BindView(R.id.pb_load_data)
    ProgressBar pbLoadData;
    @BindView(R.id.iv_home_view)
    ImageView ivHomeView;
    @BindView(R.id.textViewHome)
    TextView textViewHome;
    @BindView(R.id.linearLayoutHome)
    LinearLayout linearLayoutHome;
    @BindView(R.id.iv_explore_view)
    ImageView ivExploreView;
    @BindView(R.id.textViewExplore)
    TextView textViewExplore;
    @BindView(R.id.linearLayoutExplore)
    LinearLayout linearLayoutExplore;
    @BindView(R.id.iv_notify_view)
    ImageView ivNotifyView;
    @BindView(R.id.textViewNotification)
    TextView textViewNotification;
    @BindView(R.id.linearLayoutNotifications)
    LinearLayout linearLayoutNotifications;
    @BindView(R.id.iv_profile_view)
    ImageView ivProfileView;
    @BindView(R.id.textViewProfile)
    TextView textViewProfile;
    @BindView(R.id.linearLayoutProfile)
    LinearLayout linearLayoutProfile;
    @BindView(R.id.iv_post_song)
    ImageView ivPostSong;
    @BindView(R.id.tb_title)
    Toolbar tbTitle;
     //initialize the variable here
     private int mUserId, mViewType;
     public static final int FORGOT_VIEW = 3;
      private String mToolbarName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialization();
        setUpElements();

    }

    //for initialization
    private void initialization()
    {


    }
    //for setupelement
    private void setUpElements() {

    }
}

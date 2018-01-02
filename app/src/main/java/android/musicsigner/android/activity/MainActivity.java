package android.musicsigner.android.activity;

import android.content.Intent;
import android.musicsigner.android.R;
import android.musicsigner.android.fragment.ForgotPasswordFragment;
import android.musicsigner.android.utils.AppConstants;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    private int mContainerId;
    private int mUserId, mViewType;

    public static final int PROFILE_VIEW = 0;
    public static final int PROFILE_EDIT = 1;
    public static final int PROFILE_MINE = 2;
    public static final int FORGOT_VIEW = 3;
    public static final int LIKE_VIEW = 4;
    public static final int COMMENT_VIEW = 5;
    public static final int LISTENER_VIEW = 6;
    public static final int LISTENING_VIEW = 7;
    public static final int SINGLE_POST = 8;

    // Declare all views here
    Toolbar mToolbar;
    ImageView ivSearchIcon;
    ImageView ivInviteLeft;
    ImageView ivInviteRight;
    EditText etSearchText;
    ImageView ivIconCancel;
    ImageView ivHomeView;
    ImageView ivExploreView;
    ImageView ivPostSong;
    ImageView ivNotifyView;
    ImageView ivProfileView;
    TextView textViewHome,textViewExplore,textViewNotification,textViewProfile;
    ProgressBar pbLoadData;
    LinearLayout linearLayoutInvite;
    RelativeLayout rlTitleBar;
    Button btnRetryService;
    View viewBottomTabs;
    LinearLayout linearLayoutHome, linearLayoutExplore, linearLayoutNotification, linearLayoutProfile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViews();
        initialization();
        setUpElements();

    }

    private void setUpViews() {
        mToolbar = (Toolbar) findViewById(R.id.tb_title);
        mToolbar.setBackgroundResource(R.drawable.shape_rect_grey);
        ivHomeView = (ImageView) findViewById(R.id.iv_home_view);
        ivExploreView = (ImageView) findViewById(R.id.iv_explore_view);
        ivPostSong = (ImageView) findViewById(R.id.iv_post_song);
        ivNotifyView = (ImageView) findViewById(R.id.iv_notify_view);
        ivProfileView = (ImageView) findViewById(R.id.iv_profile_view);
        pbLoadData = (ProgressBar) findViewById(R.id.pb_load_data);
        viewBottomTabs = findViewById(R.id.view_bottom_tabs);
        textViewHome =(TextView)findViewById(R.id.textViewHome);
        textViewExplore=(TextView)findViewById(R.id.textViewExplore);
        textViewNotification=(TextView)findViewById(R.id.textViewNotification);
        textViewProfile=(TextView)findViewById(R.id.textViewProfile);
        linearLayoutHome = (LinearLayout) findViewById(R.id.linearLayoutHome);
        linearLayoutExplore = (LinearLayout) findViewById(R.id.linearLayoutExplore);
        linearLayoutNotification = (LinearLayout) findViewById(R.id.linearLayoutNotifications);
        linearLayoutProfile = (LinearLayout) findViewById(R.id.linearLayoutProfile);
    }

    //for initialization
    private void initialization() {
        mContainerId = R.id.fragment_container;
        Intent intent = getIntent();
        mViewType = intent.getIntExtra(AppConstants.VIEW_TYPE, PROFILE_VIEW);
    }

    //for setupelement
    private void setUpElements() {

        switch (mViewType) {
            case FORGOT_VIEW:
                viewBottomTabs.setVisibility(View.GONE);
                addFragment(new ForgotPasswordFragment(), mContainerId);
                break;
        }

    }


}

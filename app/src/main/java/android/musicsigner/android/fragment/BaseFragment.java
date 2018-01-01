package android.musicsigner.android.fragment;

import android.content.Context;
import android.musicsigner.android.activity.BaseActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gaurav Pandey on 31-12-2017.
 */

public class BaseFragment extends Fragment {
    protected Context mContext;
    protected BaseActivity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mActivity = (BaseActivity) getActivity();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    public void showProgress() {
        showProgress("Loading");
    }

    public void showProgress(String message) {
        mActivity.showProgress(message);
    }

    public void dismissProgress() {
        mActivity.dismissProgress();
    }



}

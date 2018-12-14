package com.example.moon.tabbedlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PazeAdapter extends FragmentPagerAdapter {

    int noOfFragment;

    public PazeAdapter(FragmentManager fm,int noOfFragment) {
        super(fm);
        this.noOfFragment = noOfFragment;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallFragment();
             default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfFragment;
    }
}

package com.android.acadgild.actionbarsfragment104.adapter;

/**
 * Created by Jal on 01-09-2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.android.acadgild.actionbarsfragment104.AudioFragment;
import com.android.acadgild.actionbarsfragment104.VideoFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Buttons fragment activity
                return new AudioFragment();
            case 1:
                // Colors fragment activity
                return new VideoFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}
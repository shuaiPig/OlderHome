package com.example.liubo.olderhome.controller;

/**
 * Created by liubo on 2017/10/31.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



/**
 * Created by GIGAMOLE on 8/18/16.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private final static int COUNT = 3;

    private final static int HORIZONTAL = 0;
    private final static int TWO_WAY = 1;

    public MainPagerAdapter(final FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case TWO_WAY:

            case HORIZONTAL:
            default:
                return new HorizontalPagerFragment();
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}


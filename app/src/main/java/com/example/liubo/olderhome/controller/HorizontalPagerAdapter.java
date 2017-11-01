package com.example.liubo.olderhome.controller;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liubo.olderhome.R;
import com.gigamole.infinitecycleviewpager.VerticalInfiniteCycleViewPager;

import static com.example.liubo.olderhome.controller.Utils.setupItem;


/**
 * Created by GIGAMOLE on 7/27/16.
 */
public class HorizontalPagerAdapter extends PagerAdapter {

    private final Utils.LibraryObject[] LIBRARIES = new Utils.LibraryObject[]{
            new Utils.LibraryObject(
                    R.drawable.cart,
                    "Strategy"
            ),
            new Utils.LibraryObject(
                    R.drawable.cart,
                    "Design"
            ),
            new Utils.LibraryObject(
                    R.drawable.cart,
                    "Development"
            ),
            new Utils.LibraryObject(
                    R.drawable.cart,
                    "Quality Assurance"
            )
    };

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    private boolean mIsTwoWay;

    public HorizontalPagerAdapter(final Context context, final boolean isTwoWay) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mIsTwoWay = isTwoWay;
    }

    @Override
    public int getCount() {
        return mIsTwoWay ? 6 : LIBRARIES.length;
    }

    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view;
            view = mLayoutInflater.inflate(R.layout.main_items, container, false);
            setupItem(view, LIBRARIES[position]);
        container.addView(view);
        return view;
    }



    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View) object);
    }
}
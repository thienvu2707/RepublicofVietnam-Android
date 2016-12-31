package com.example.android.republicofvietnam;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ThienVu on 12-Dec-16.
 */

public class CategoriesAdapter extends FragmentPagerAdapter {
    Context mContext;

    public CategoriesAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DanangFragment();
        } else if (position == 1) {
            return new SaigonFragment();
        } else if (position == 2) {
            return new HalongFragment();
        } else {
            return new SapaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_danang);
        } else if (position == 1) {
            return mContext.getString(R.string.category_saigon);
        } else if (position == 2) {
            return mContext.getString(R.string.category_halong);
        } else {
            return mContext.getString(R.string.category_sapa);
        }
    }
}

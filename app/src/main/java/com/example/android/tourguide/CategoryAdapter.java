package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    //** context of the app
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new AttractionsFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new CraftFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    // The titles of the tabs
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cities);
        } else if (position == 1) {
            return mContext.getString(R.string.sites);
        } else if (position == 2) {
            return mContext.getString(R.string.food);
        } else {
            return mContext.getString(R.string.craft);
        }
    }
}


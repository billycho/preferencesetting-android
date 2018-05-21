package com.qwersoft.preferencessettings;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;

/**
 * Created by IT02106 on 21/05/2018.
 */

public class SimpleFragmentPagerAdapter  extends FragmentPagerAdapter {
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new UsefulInfoFragment();
        }
        else if(position == 1)
        {
            return new MainPreferenceFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Tab #01";
            case 1:
                return "Tab #02";
            default:
                return null;

        }
    }
}

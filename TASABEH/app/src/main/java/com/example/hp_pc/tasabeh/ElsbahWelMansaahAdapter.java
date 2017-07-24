package com.example.hp_pc.tasabeh;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HP-PC on 7/9/2017.
 */

public class ElsbahWelMansaahAdapter extends FragmentPagerAdapter {
    private Context context;

    public ElsbahWelMansaahAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }



    @Override
    public Fragment getItem(int position  ) {
        if (position == 0) {
            return new ElsabahFragment();
        } else   {
            return new ElmasaaFragment();
        }


    }
//no of tab
    @Override
    public int getCount() {
        return 2;
    }

// Create tab name
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.AzkaarElsabah);
        } else {

            return context.getString(R.string.AzkaarElmasaa);

        }
    }

}


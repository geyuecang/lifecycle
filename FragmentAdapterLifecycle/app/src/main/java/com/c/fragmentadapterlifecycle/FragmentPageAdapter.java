package com.c.fragmentadapterlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * author : geyuecang
 * date   : 2019/5/7 18:04
 * desc   : desc
 */
public class FragmentPageAdapter extends FragmentPagerAdapter {
    private String[] titles = {"tab1", "tab2", "tab3", "tab4", "tab5", "tab6",};

    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        MFragment fragment = new MFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ags", i + 1);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}

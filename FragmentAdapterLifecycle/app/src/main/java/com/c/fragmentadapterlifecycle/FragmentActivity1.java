package com.c.fragmentadapterlifecycle;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity1 extends AppCompatActivity {

    private ViewPager viewpager;
    private TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
        viewpager = findViewById(R.id.viewpager);
        tablayout = findViewById(R.id.tablayout);
        tablayout.setupWithViewPager(viewpager);
        viewpager.setAdapter(new FragmentPageAdapter(getSupportFragmentManager()));
    }
}

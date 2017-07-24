package com.example.hp_pc.tasabeh;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;

public class ElsbahWelmasaah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_elsbah_welmasaah.xml layout file
        setContentView(R.layout.activity_elsbah_welmasaah);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        ElsbahWelMansaahAdapter adapter = new ElsbahWelMansaahAdapter(getSupportFragmentManager(),ElsbahWelmasaah.this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        TabLayout tablLayout = (TabLayout) findViewById(R.id.tab_Layout);
        tablLayout.setupWithViewPager(viewPager);

    }
}

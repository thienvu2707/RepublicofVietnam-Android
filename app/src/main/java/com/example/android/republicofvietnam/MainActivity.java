package com.example.android.republicofvietnam;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //create and adapter that know which fragment
        CategoriesAdapter adapter = new CategoriesAdapter(this, getSupportFragmentManager());

        //set the adapter to on view page
        viewPager.setAdapter(adapter);

        //find the tab which show in the screen
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        //connect tablayout with view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}

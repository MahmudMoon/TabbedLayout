package com.example.moon.tabbedlayout;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    TabItem tabChats,tabStatus,tabCalls;
    ViewPager viewPager;
    PazeAdapter pazeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_views();
        init_variables();
        init_functions();
        init_listeners();
    }

    private void init_views() {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabChats = (TabItem)findViewById(R.id.tabChats);
        tabStatus = (TabItem)findViewById(R.id.tabStatus);
        tabCalls = (TabItem)findViewById(R.id.tabCalls);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
    }

    private void init_variables() {
        pazeAdapter = new PazeAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pazeAdapter);
    }

    private void init_functions() {

    }

    private void init_listeners() {
       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });
    }
}

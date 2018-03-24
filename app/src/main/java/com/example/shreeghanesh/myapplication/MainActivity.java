package com.example.shreeghanesh.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private PageAdapter pageAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageAdapter =new PageAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

    }

    public void setupViewPager(ViewPager viewPager) {
        PageAdapter vpageAdapter = new PageAdapter(getSupportFragmentManager());
        vpageAdapter.addFragment(new Tab1Fragment(),"Tab-1");
        vpageAdapter.addFragment(new Tab2Fragment(),"Tab-2");
        viewPager.setAdapter(vpageAdapter);
    }
}
package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView((R.layout.activity_main));

    ViewPager viewPager = findViewById(R.id.pager);
    pager_adapter adapter = new pager_adapter(getSupportFragmentManager());
    viewPager.setAdapter(adapter);
}
}

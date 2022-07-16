package com.oxigen.hardware.penstore;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    void initUI(){
        bottomNavigationView = findViewById(R.id.view_nav);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup bottomNav behaviour
        initUI();
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment;

            if (item.getItemId() == R.id.btnv_acc){
                selectedFragment = new FragerAccount();
            } else if (item.getItemId() == R.id.btnv_my){
                selectedFragment = new FragerMyStationary();
            } else if (item.getItemId() == R.id.btnv_sto){
                selectedFragment = new FragerStore();
            } else {
                selectedFragment = new FragerMyStationary();
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.view_frame, selectedFragment)
                    .commit();
            return true;
        });
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.view_frame, new FragerMyStationary())
                .commit();

        // actionBar custom
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable;
        colorDrawable = new ColorDrawable(Color.parseColor("#9B111E"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
    }
}
package com.example.rpereira.fragmentwithrelativelayout;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.rpereira.fragmentwithrelativelayout.fragments.FragmentLayoutLeft;

public class MainActivity extends FragmentActivity {

    private FragmentLayoutLeft fragmentLayoutLeft;

    private FragmentManager fragmentManager;

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if(savedInstanceState == null) {
            fragmentLayoutLeft = new FragmentLayoutLeft();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.idLayoutLeft, fragmentLayoutLeft, "fragLeft");
            fragmentTransaction.commit();
        }

    }
}

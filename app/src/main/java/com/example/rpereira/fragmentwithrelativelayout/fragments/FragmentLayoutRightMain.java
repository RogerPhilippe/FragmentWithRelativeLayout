package com.example.rpereira.fragmentwithrelativelayout.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rpereira.fragmentwithrelativelayout.R;

public class FragmentLayoutRightMain extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_right_main, null);

        return view;
    }

}

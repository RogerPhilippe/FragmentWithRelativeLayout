package com.example.rpereira.fragmentwithrelativelayout.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rpereira.fragmentwithrelativelayout.R;

public class FragmentLayoutLeft extends Fragment {

    private ListView lvFragmentLayoutLeft;

    private FragmentLayoutRightMain fragmentLayoutRightMain;

    private FragmentLayoutRightSecondary fragmentLayoutRightSecondary;

    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_left, null);

        lvFragmentLayoutLeft = (ListView) view.findViewById(R.id.idlvFragmentLayoutLeft);

        String[] items = new String[] {"Item 1", "Item 2", "Item 3", "Item 4"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(parent.getContext(), android.R.layout.simple_list_item_1, items);

        lvFragmentLayoutLeft.setAdapter(adapter);

        lvFragmentLayoutLeft.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        fragmentLayoutRightMain = new FragmentLayoutRightMain();
                        fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.idLayoutRight, fragmentLayoutRightMain, "frag_layout_r_main");
                        fragmentTransaction.addToBackStack("stack");
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        fragmentLayoutRightSecondary = new FragmentLayoutRightSecondary();
                        fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.idLayoutRight, fragmentLayoutRightSecondary, "frag_layout_r_second");
                        fragmentTransaction.addToBackStack("stack");
                        fragmentTransaction.commit();
                        break;
                }
            }
        });

        return view;
    }

}

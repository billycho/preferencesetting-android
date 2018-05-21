package com.qwersoft.preferencessettings;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by IT02106 on 21/05/2018.
 */

public class FragmentExample extends Fragment {
    public FragmentExample() {
        // Required empty public constructor
    }

    public static UsefulInfoFragment newInstance() {
        UsefulInfoFragment fragment = new UsefulInfoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_useful_info, container, false);
    }
}

package com.qwersoft.preferencessettings;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class UsefulInfoFragment extends Fragment {


    public UsefulInfoFragment() {
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

package com.hackerkernel.practicelifecycle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }
}
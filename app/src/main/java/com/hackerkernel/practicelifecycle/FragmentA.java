package com.hackerkernel.practicelifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FragmentA extends Fragment {

    private static final String TAG = "FragmentA";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_a, container, false);

        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return view;
    }

    @Override
    public void onAttach( Context context) {
        super.onAttach(context);
        Toast.makeText(getContext(), "onAttach", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toast.makeText(getContext(), "onActivityCreated", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), "on create", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getContext(), "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getContext(), "onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(), "on onDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getContext(), "on onDetach", Toast.LENGTH_SHORT).show();

    }
}
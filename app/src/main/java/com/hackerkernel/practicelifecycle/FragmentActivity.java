package com.hackerkernel.practicelifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FragmentActivity extends AppCompatActivity {

    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);


        Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replace(new FragmentA());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replace(new FragmentB());
            }
        });
    }

    void replace(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onstart", Toast.LENGTH_SHORT).show();
        // Log.d(TAG, "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();

        // Log.d(TAG, "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();
        // Log.d(TAG, "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();
        // Log.d(TAG, "on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "on destroy", Toast.LENGTH_SHORT).show();
        //Log.d(TAG, "onDestroy");
    }
}
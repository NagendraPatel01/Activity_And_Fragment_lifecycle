package com.hackerkernel.practicelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,TopActivity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();

       // Log.d(TAG, "on create");
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
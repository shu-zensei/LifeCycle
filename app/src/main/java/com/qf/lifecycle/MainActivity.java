package com.qf.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "custom_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate is worked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart is worked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume is worked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause is worked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop is worked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart is worked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy is worked");
    }
}

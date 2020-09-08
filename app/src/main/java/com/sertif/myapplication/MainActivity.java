package com.sertif.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, ", Error");
        Log.i(TAG, ", Informasi ");
        Log.w(TAG, ", Warning");
        Log.d(TAG, ", Debug");
        Log.v(TAG, ", Verbose");
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Question 1","MainActivity.java");
        Log.d("Question 2","app_name");
        Log.d("Question 3","AVD Manager");
        Log.d("Question 4", "Verbose et Info");
    }
}
package com.example.testmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG" , "onCreate:  Welcome");
        Log.d("TAG" , "onCreate:  Welcome Mahmoud Nayef");
    }
}
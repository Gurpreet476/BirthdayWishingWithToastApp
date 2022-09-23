package com.example.birthdaywishingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createBirthdayCard(View view) {
        
        Toast.makeText(getApplicationContext() ,
                "Button is clicked",
                Toast.LENGTH_LONG)
                .show();
    }



}
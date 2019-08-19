package com.example.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main3Activitynull extends AppCompatActivity {
public String takeExtra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_activitynull);
        Intent myintent = new Intent();
        takeExtra = myintent.getStringExtra("Main Extra");
    }
}

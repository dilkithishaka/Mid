package com.example.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activitynull extends AppCompatActivity {
    public  String myExtra ="text";
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activitynull);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener();
    }
public void onclick(View view){
        Intent intent = new Intent(Main2Activitynull.this,Main3Activitynull.class)
    intent.putExtra("Main Extra",myExtra);
    startActivity(intent);
    }

}

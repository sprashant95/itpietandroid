package com.example.selfassessmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TravelActivity extends AppCompatActivity {

    CheckBox cough,fever,headache;
    FloatingActionButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        cough = findViewById(R.id.cough);
        fever = findViewById(R.id.fever);
        headache = findViewById(R.id.headache);
        btn = findViewById(R.id.thirdbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fever.isChecked()){
                    Toast.makeText(TravelActivity.this, "You have fever, please be safe", Toast.LENGTH_SHORT).show();
                }
                if(cough.isChecked()){
                    Toast.makeText(TravelActivity.this, "You have cough, take rest", Toast.LENGTH_SHORT).show();
                }
                if(headache.isChecked()){
                    Toast.makeText(TravelActivity.this, "You have headache, take rest", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(),AgeGroupActivity.class);
                startActivity(intent);
            }
        });
    }
}
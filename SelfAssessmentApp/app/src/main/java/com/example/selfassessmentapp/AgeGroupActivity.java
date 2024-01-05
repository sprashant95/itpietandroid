package com.example.selfassessmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class AgeGroupActivity extends AppCompatActivity {

    Spinner spinner;
    Button btn;
    String[] agegroup = {"3....12","13....21","22....40","Above 40"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_group);
        
        spinner = findViewById(R.id.spinner);
        btn = findViewById(R.id.submit);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,agegroup);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AgeGroupActivity.this, "Your data is submitted, You are safe from COVID 19", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
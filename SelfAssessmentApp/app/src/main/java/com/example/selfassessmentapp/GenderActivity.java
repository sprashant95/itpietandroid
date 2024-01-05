package com.example.selfassessmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GenderActivity extends AppCompatActivity {

    RadioButton male, female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
    }

    public void genderbtn(View view) {

        if(male.isChecked()){
            Toast.makeText(this, "You clicked : Male", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),TravelActivity.class);
            startActivity(intent);
        }
        else if(female.isChecked()){
            Toast.makeText(this, "You clicked : Female ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),TravelActivity.class);
            startActivity(intent);
        }
    }
}
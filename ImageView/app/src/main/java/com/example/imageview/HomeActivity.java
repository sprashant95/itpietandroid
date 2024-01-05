package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ImageButton bmw, ferrari, bentley, mini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bmw = findViewById(R.id.bmw);
        ferrari = findViewById(R.id.ferrari);
        bentley = findViewById(R.id.bentley);
        mini = findViewById(R.id.mini);

        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"You are redirecting to BMW APP",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), DetailedActivity.class);
                intent.putExtra("url", "https://www.bmw.in/en/index.html");
                startActivity(intent);


            }
        });

        ferrari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You are redirecting to Ferrari APP",Toast.LENGTH_SHORT).show();
            }
        });

        mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bentley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
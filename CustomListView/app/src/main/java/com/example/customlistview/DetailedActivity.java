package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailedActivity extends AppCompatActivity {

    CircleImageView circleImageView;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        circleImageView = findViewById(R.id.dimage);
        name = findViewById(R.id.dname);


        Intent intent = getIntent();
        String dname = intent.getStringExtra("name");
        int dimage = intent.getIntExtra("image",R.drawable.ic_launcher_background);

        name.setText(dname);
        circleImageView.setImageResource(dimage);
    }

}
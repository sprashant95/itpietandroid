package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String brand_name[] = {"BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER","BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER",
            "BMW","FERRARI","FIAT","BENTLEY","MINI COOPER"};

    String launched_year[] = {"Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021","Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021",
            "Launched in 2001","Launched in 1995","Launched in 2014","Launched in 1899","Launched in 2021"};


    int logos[] = {R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini,
            R.drawable.bmw,R.drawable.ferrari,R.drawable.fiat,R.drawable.bentley,R.drawable.mini};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,brand_name,launched_year,logos);
        listView.setAdapter(myCustomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),DetailedActivity.class);
                intent.putExtra("image",logos[i]);
                intent.putExtra("name",brand_name[i]);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);

        return super.onCreateOptionsMenu(menu);
    }
}


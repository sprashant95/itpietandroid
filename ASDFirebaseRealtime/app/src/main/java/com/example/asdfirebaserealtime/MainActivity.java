package com.example.asdfirebaserealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    EditText id, name, phone, specialization;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.drid);
        name = findViewById(R.id.drname);
        phone = findViewById(R.id.drphone);
        specialization = findViewById(R.id.drsp);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String drid = id.getText().toString();
                String drname = name.getText().toString();
                String drphone = phone.getText().toString();
                String drsp = specialization.getText().toString();

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference ref = db.getReference("doctors");

                DBHandler dbHandler = new DBHandler(drname,drphone,drsp);

                ref.child(drid).setValue(dbHandler);

                id.setText("");
                name.setText("");
                phone.setText("");
                specialization.setText("");
                Toast.makeText(MainActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
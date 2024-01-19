package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datepicker);
        timePicker = findViewById(R.id.timePicker);
    }

    public void showDate(View view) {

        String result = "Selected Date is : " + datePicker.getDayOfMonth() + "/" + (datePicker.getMonth()+1) + "/" + datePicker.getYear();
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    public void showTime(View view) {

        timePicker.is24HourView();

        if (timePicker.getHour()<12){
            String time = "AM";
            String result = "Selected Time is : " + timePicker.getHour() + ":" + timePicker.getMinute() + time;
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }
        else {
            String time = "PM";
            String result = "Selected Time is : " + timePicker.getHour() + ":" + timePicker.getMinute() + time;
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }

    }
}
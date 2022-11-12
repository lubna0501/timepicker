package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
TimePicker timepicker;
Button button;
TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Connectxml();
        textview=findViewById(R.id.text);
        button=findViewById(R.id.btn);
        timepicker=findViewById(R.id.time);
        timepicker.setIs24HourView(false);
        String timetext=gettime();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String timetext=gettime();
                textview.setText(timetext);
            }
        });
        

    }

    private String gettime() {
        int hour = timepicker.getHour();
        int minutes= timepicker.getMinute();
        String finaltimetext="current time => "+ String.valueOf(hour)+":"+String.valueOf(minutes);
        return finaltimetext;
    }

    private void Connectxml() {
    }
}
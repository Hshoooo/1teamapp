package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GoCalendar extends AppCompatActivity {
    private static final String TAG = "GoCalendar";

    private TextView theDate;
    private Button btnGoCalendar;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_ex2);
        theDate = findViewById(R.id.date);
        btnGoCalendar = findViewById(R.id.calendarView);


        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");
        theDate.setText(date);

        btnGoCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoCalendar.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}

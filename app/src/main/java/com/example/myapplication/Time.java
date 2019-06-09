package com.example.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Time extends AppCompatActivity {
    //냐하
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        Button b = (Button) findViewById(R.id.button1);

        final TextView tv = (TextView) findViewById(R.id.textView4);


        b.setOnClickListener(new View.OnClickListener() {

            CheckBox cb1 = findViewById(R.id.h_1);
            CheckBox cb2 = findViewById(R.id.h_2);
            CheckBox cb3 = findViewById(R.id.h_3);

            public void onClick(View v) {
                String str_h = "";
                if (cb1.isChecked() == true) str_h += cb1.getText().toString();
                if (cb2.isChecked() == true) str_h += cb2.getText().toString();
                tv.setText("선택결과:" + str_h);
            }
        });
    }
}
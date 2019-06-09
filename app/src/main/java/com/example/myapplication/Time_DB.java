package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.net.MalformedURLException;

public class Time_DB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);
        NetworkUtil.setNetworkPolicy();

        final CheckBox cb1 = findViewById(R.id.h_1);
        final CheckBox cb2 = findViewById(R.id.h_2);
        CheckBox cb3 = findViewById(R.id.h_3);

        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    PHPRequest request = new PHPRequest("http://203.234.62.110/time_insert.php");
                    String result = request.PhPtest(String.valueOf(cb1.getText().toString()), String.valueOf(cb2.getText().toString()));
                    if (result.equals("1")) {
                        Toast.makeText(getApplication(), "들어감", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplication(), "안 들어감", Toast.LENGTH_SHORT).show();
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


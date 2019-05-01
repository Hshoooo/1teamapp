package com.example.myapplication;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;



public class MainActivity extends Activity implements OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_move = (Button)findViewById(R.id.button1);
        btn_move.setOnClickListener(this);

    }
    public void onClick(View v) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }
}


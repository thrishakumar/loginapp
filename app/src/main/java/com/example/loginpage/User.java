package com.example.loginpage;

import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class User extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        text = (TextView)findViewById(R.id.text);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText("Welcome"+","+str);
    }
}
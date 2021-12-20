package com.example.easybookdental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class booking1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking1);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textView1 = (TextView) findViewById(R.id.texrr);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText(text);
        textView3.setText(text3);
        textView2.setText("" + number);

    }
}
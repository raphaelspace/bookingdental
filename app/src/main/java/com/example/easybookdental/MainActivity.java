package com.example.easybookdental;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_TEXT3 = "com.example.application.example.EXTRA_TEXT3";
    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {

        Intent intent = new Intent(this,  MapsActivity.class);

        startActivity(intent);
    }
    public void openActivity4() {

        Intent intent = new Intent(this,  calander.class);

        startActivity(intent);
    }
    public void openActivity3() {
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text = editText1.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.edittext3);
        String text3 = editText3.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        int number = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, booking1.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_TEXT3, text3);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}

package com.example.pfowenli.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Owen P. F. LI");
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(45);

        setContentView(textView);
    }
}

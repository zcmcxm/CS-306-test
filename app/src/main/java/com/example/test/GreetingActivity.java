package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String mainName = intent.getStringExtra("mainName");

        TextView simpleTextView = (TextView) findViewById(R.id.greetingMessage);
        simpleTextView.setText(simpleTextView.getText()+ "! " + mainName);
    }
}

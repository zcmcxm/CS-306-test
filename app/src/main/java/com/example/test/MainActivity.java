package com.example.test;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText simpleEditText = (EditText) findViewById(R.id.mainName);

        Button button = (Button) findViewById(R.id.mainStartButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nameValue = simpleEditText.getText().toString();
                Intent myIntent = new Intent(MainActivity.this, GreetingActivity.class);
                myIntent.putExtra("mainName", nameValue);
                startActivity(myIntent);
            }
        });
    }
}
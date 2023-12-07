package com.example.mplaba1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String surname = getIntent().getStringExtra("surname");
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + surname);
    }
}
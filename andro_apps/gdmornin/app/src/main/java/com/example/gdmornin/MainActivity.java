package com.example.gdmornin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "🌄 🌄 🌄 Good Morning!! 🌄 🌄 🌄", Toast.LENGTH_SHORT).show();
        text = (TextView) findViewById(R.id.text);
        text.setText("🌄 Good Morning!! 🌄");

    }
}
package com.example.adder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EditText1;
    EditText EditText2;
    TextView TextView3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add two numbers
        EditText1 = (EditText) findViewById(R.id.editText1);
        EditText2 = (EditText) findViewById(R.id.editText2);
        TextView3 = findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(EditText1.getText().toString());
                int num2 = Integer.parseInt(EditText2.getText().toString());
                int result = num1 + num2;
                TextView3.setText("Addition of two numbers is " +  result);
            }
        });

    }
}
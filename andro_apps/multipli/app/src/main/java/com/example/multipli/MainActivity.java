package com.example.multipli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView2, textView3;
    EditText n1, n2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(MainActivity.this.n1.getText().toString());
                int n2 = Integer.parseInt(MainActivity.this.n2.getText().toString());
                int result = n1 * n2;
                textView3.setText("The value of n1 * n2 is: " + result);
                Toast.makeText(MainActivity.this, "Thanks for using my app", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
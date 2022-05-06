package com.example.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    private EditText editTextNumber;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);

        //******1st type of function*****

        //        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast toast = Toast.makeText(getApplicationContext(), "UniCon 🐴 Supremacy!!", Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER, 0, 0);  //toast position center
//                toast.show();
//                String s = editTextNumber.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.2046 * kg;
//                textView2.setText("The corresponding Pound Value is " + pound);
//            }
//        });

        //*******2nd type of function but same as above (types of functions)*******
    }
        public void calculate(View view) {
            String s = editTextNumber.getText().toString();
            int kg = Integer.parseInt(s);
            double pound = 2.2046 * kg;
            textView2.setText("The corresponding Pound Value is " + pound);



    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Calculator = findViewById(R.id.textView);
        EditText FirstNumber = findViewById(R.id.num1);
        EditText SecondNumber = findViewById(R.id.num2);
        Button CALCULATE = findViewById(R.id.button);
        TextView Total = findViewById(R.id.textView2);

        CALCULATE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer .parseInt(FirstNumber.getText().toString());
                int num2 = Integer .parseInt(SecondNumber.getText().toString());

                int result = num1 + num2;

                Total.setText(String.valueOf(result));
            }
        });

    }
}
package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class currency extends AppCompatActivity {

    private Button ustoinr;
    private Button inrtous;
    private TextView result;
    private EditText entercurr;
    double res3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        ustoinr = findViewById(R.id.ustoinr);
        inrtous= findViewById(R.id.inrtous);
        result = findViewById(R.id.res4);
        entercurr = findViewById(R.id.entercurr);

        ustoinr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cur = Double.parseDouble(entercurr.getText().toString());
                res3 = (cur*79.89);
                result.setText(String.valueOf(res3) + " Rs");
            }
        });
        inrtous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cur = Double.parseDouble(entercurr.getText().toString());
                res3 = (cur*0.012);
                result.setText(String.valueOf(res3) + " $");
            }
        });
    }
}
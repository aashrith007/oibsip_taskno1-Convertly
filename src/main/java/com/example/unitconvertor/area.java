package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class area extends AppCompatActivity {

    private Button actohec;
    private Button actosq;
    private Button  sqtohec;
    private Button sqtoac;
    private Button hectoac;
    private Button hectosq;
    private TextView result5;
    private EditText enterarea;
    double res4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        actohec = findViewById(R.id.actohec);
        actosq = findViewById(R.id.actosq);
        sqtohec = findViewById(R.id.sqtohec);
        sqtoac = findViewById(R.id.sqtoacre);
        hectoac = findViewById(R.id.hectoac);
        hectosq = findViewById(R.id.hectosq);
        result5 = findViewById(R.id.result5);
        enterarea = findViewById(R.id.enterarea);

        actohec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double area = Double.parseDouble(enterarea.getText().toString());
                res4 = (area*0.4046856422);
                result5.setText(String.valueOf(res4)+ " ha");
            }
        });

        actosq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double area = Double.parseDouble(enterarea.getText().toString());
                res4 = (area*4046.8564224);
                result5.setText(String.valueOf(res4)+ " Square metres");
            }
        });

        sqtoac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double area = Double.parseDouble(enterarea.getText().toString());
                res4 = area*0.0002471054;
                result5.setText(String.valueOf(res4)+ " ac");
            }
        });

        sqtohec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double area = Double.parseDouble(enterarea.getText().toString());
                res4 = area*0.0001;
                result5.setText(String.valueOf(res4)+ " ha");
            }
        });

        hectoac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double area = Double.parseDouble(enterarea.getText().toString());
                res4 = area*2.4710538147;
                result5.setText(String.valueOf(res4)+ " Acres");
            }
        });

        hectosq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double area = Double.parseDouble(enterarea.getText().toString());
                res4 = area*10000;
                result5.setText(String.valueOf(res4) + " Square Metres");
            }
        });

    }
}
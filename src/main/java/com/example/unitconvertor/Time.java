package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Time extends AppCompatActivity {

    private Button sectom;
    private Button sectohr;
    private Button mtosec;
    private Button mtohr;
    private Button hrtosec;
    private Button hrtomin;
    private TextView result3;
    private EditText entertime;
    double res3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        sectom = findViewById(R.id.sectom);
        sectohr = findViewById(R.id.sectohr);
        mtosec = findViewById(R.id.mtosec);
        mtohr = findViewById(R.id.mtohr);
        hrtosec = findViewById(R.id.hrtosec);
        hrtomin = findViewById(R.id.hrtomin);
        result3 = findViewById(R.id.result3);
        entertime = findViewById(R.id.entertime);

        sectom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double time = Double.parseDouble(entertime.getText().toString());
                res3 = (time/60);
                result3.setText(String.valueOf(res3)+" minutes");
            }
        });
        sectohr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double time = Double.parseDouble(entertime.getText().toString());
                res3 = (time*0.000277777778);
                result3.setText(String.valueOf(res3)+ " hours");
            }
        });
        mtosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double time = Double.parseDouble(entertime.getText().toString());
                res3 = (time*60);
                result3.setText(String.valueOf(res3)+ " seconds");
            }
        });
        mtohr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double time = Double.parseDouble(entertime.getText().toString());
                res3 = (time*0.0166666667);
                result3.setText(String.valueOf(res3)+ " hours");
            }
        });
        hrtosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double time = Double.parseDouble(entertime.getText().toString());
                res3 = (time*3600);
                result3.setText(String.valueOf(res3)+ " seconds");
            }
        });
        hrtomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double time = Double.parseDouble(entertime.getText().toString());
                res3 = (time*60);
                result3.setText(String.valueOf(res3) + " minutes");
            }
        });

    }
    }

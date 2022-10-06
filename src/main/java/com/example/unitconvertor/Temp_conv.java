package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temp_conv extends AppCompatActivity {

    private Button cToF,fToC;
    private TextView res;
    private EditText enterTemp;
    double res0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_conv);


        cToF = findViewById(R.id.cToF);
        fToC = findViewById(R.id.fToC);
        res = findViewById(R.id.res);
        enterTemp = findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                res0 = (temp *1.8) + 32;
                res.setText(String.valueOf(res0)+ " F");
            }
        });
        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                res0 = (temp - 32)/1.8;
                res.setText(String.valueOf(res0)+" C");
            }
        });


    }
}
package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight_conv extends AppCompatActivity {


    private Button Kgtogram;
    private Button gramTokg;
    private TextView result;
    private EditText enterweight;
    double res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_conv);

        Kgtogram = findViewById(R.id.Kgtogram);
        gramTokg = findViewById(R.id.gramToKg);
        result= findViewById(R.id.result);
        enterweight = findViewById(R.id.enterTemp1);

        gramTokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(enterweight.getText().toString());
                res1 = (weight/1000);
                result.setText(String.valueOf(res1)+ " Kg");
            }
        });
        Kgtogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(enterweight.getText().toString());
                res1 = (weight*1000);
                result.setText(String.valueOf(res1)+ " Grams");
            }
        });

    }
}
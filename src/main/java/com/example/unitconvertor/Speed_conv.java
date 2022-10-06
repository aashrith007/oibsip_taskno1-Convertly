package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Speed_conv extends AppCompatActivity {

    private Button kmtom;
    private Button mtokm;
    private TextView result;
    private EditText enterspeed;
    double res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_conv);

        kmtom = findViewById(R.id.Kmtom);
        mtokm = findViewById(R.id.mtokm);
        result = findViewById(R.id.result);
        enterspeed = findViewById(R.id.enterspeed);

        kmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double speed = Double.parseDouble(enterspeed.getText().toString());
                res2 = (speed/3.6);
                result.setText(String.valueOf(res2)+ " m/s");
            }
        });
        mtokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double speed = Double.parseDouble(enterspeed.getText().toString());
                res2 = (speed*3.6);
                result.setText(String.valueOf(res2)+ " km/h");
            }
        });
    }
}
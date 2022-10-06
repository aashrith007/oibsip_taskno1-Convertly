package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   CardView cv_temp;
   CardView cv_weight;
   CardView cv_speedd;
   CardView cv_time;
   CardView cv_curr;
   CardView cv_area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    cv_temp = findViewById(R.id.cv_tmp);

    cv_temp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,Temp_conv.class));
        }
    });

    cv_weight = findViewById(R.id.cv_weight);

    cv_weight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, weight_conv.class));
        }
    });

    cv_speedd = findViewById(R.id.cv_speed);

    cv_speedd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, Speed_conv.class));
        }
    });

        cv_time = findViewById(R.id.cv_time);

        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Time.class));
            }
        });

        cv_curr = findViewById(R.id.cv_curr);

        cv_curr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, currency.class));
            }
        });

        cv_area = findViewById(R.id.cv_area);

        cv_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, area.class));
            }
        });
    }
}
package com.sangeeth.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    EditText base, height;
    TextView result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);
        base = findViewById(R.id.prism_base_side);
        height = findViewById(R.id.prism_height);
        result = findViewById(R.id.prism_volume);
        btn = findViewById(R.id.calculatePrismVolume);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double baseSide = Double.parseDouble(base.getText().toString());
                double heightOfPrism = Double.parseDouble(height.getText().toString());
                double volume = (baseSide * baseSide) * heightOfPrism;
                result.setText("V = "+volume+"m^3");
            }
        });

    }
}
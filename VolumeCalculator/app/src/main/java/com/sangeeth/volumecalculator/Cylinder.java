package com.sangeeth.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText cylinderRadius, cylinderHeight;
    Button btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        cylinderRadius = findViewById(R.id.cyl_base_radius);
        cylinderHeight = findViewById(R.id.editText_cyl_height);
        btn = findViewById(R.id.calculateCylVolume);
        result = findViewById(R.id.cyl_volume);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double baseRadius = Double.parseDouble(cylinderRadius.getText().toString());
                double height = Double.parseDouble(cylinderHeight.getText().toString());
                double volume = 3.14159 * (baseRadius * baseRadius) * height;
                result.setText("V = "+volume+"m^3");
            }
        });
    }
}
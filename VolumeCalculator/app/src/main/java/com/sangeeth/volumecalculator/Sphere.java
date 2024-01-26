package com.sangeeth.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView result;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        sphereRadius = findViewById(R.id.editText_sphere);
        result = findViewById(R.id.sphere_volume);
        btn = findViewById(R.id.calculate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphereRadius.getText().toString();
                int r = Integer.parseInt(radius);
                double volume = (4/3) * 3.14159 * r * r * r;
                result.setText("V = "+volume+" m^3");
            }
        });

    }
}
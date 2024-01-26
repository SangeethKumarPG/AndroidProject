package com.sangeeth.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {
    EditText side;
    Button btn;

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        side = findViewById(R.id.editText_cube);
        result = findViewById(R.id.cube_volume);
        btn = findViewById(R.id.calculateCubeVolume);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sideOfCube = Integer.parseInt(side.getText().toString());
                double volume = sideOfCube * sideOfCube * sideOfCube;
                result.setText("V= "+volume+" m^3");
            }
        });
    }
}
package com.sangeeth.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText kilograms;
    Button convertButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.result);
        kilograms = findViewById(R.id.editText);
        convertButton = findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputInKilos = kilograms.getText().toString();
                try {
                    output.setText(""+makeConversion(Double.parseDouble(inputInKilos)));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,
                            "Please provide a number",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public double makeConversion(double kilos){
        return kilos * 2.20462;
    }
}
package com.sangeeth.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView textView, result;
    Button shareButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView2);
        result = findViewById(R.id.result);
        shareButton = findViewById(R.id.shareBtn);

        // Receiving data from intent
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");


        //Generating random numbers
        int randomNumber = generatedNumber();
        result.setText(""+randomNumber);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, randomNumber);
            }
        });

    }
    public int generatedNumber(){
        Random random = new Random();
        int upperLimit = 1000;

        return random.nextInt(upperLimit);

    }
    public void shareData(String user, int number){
        //Implicit intent
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,user+"got lucky today");
        intent.putExtra(Intent.EXTRA_TEXT,"His lucky number is : "+number);
        startActivity(Intent.createChooser(intent,"Choose a platform"));
    }
}
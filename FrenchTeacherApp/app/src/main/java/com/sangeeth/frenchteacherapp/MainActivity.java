package com.sangeeth.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackButton, redButton, purpleButton, yellowButton, greenButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackButton = findViewById(R.id.black_button);
        yellowButton = findViewById(R.id.yellow_button);
        greenButton = findViewById(R.id.green_button);
        purpleButton = findViewById(R.id.purple_button);
        redButton = findViewById(R.id.red_button);
        //Not an efficient way
//        blackButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MediaPlayer mediaPlayer = MediaPlayer.create(
//                        getApplicationContext(),R.raw.black
//                );
//                mediaPlayer.start();
//            }
//        });

        // Better way
        blackButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedButton = v.getId();
        if (clickedButton == R.id.black_button){
            playSound(R.raw.black);
        } else if (clickedButton == R.id.red_button) {
            playSound(R.raw.red);
        } else if (clickedButton == R.id.green_button) {
            playSound(R.raw.green);
        } else if (clickedButton == R.id.purple_button) {
            playSound(R.raw.purple);
        } else if (clickedButton == R.id.yellow_button) {
            playSound(R.raw.yellow);
        }
    }

    public void playSound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),
                id);
        mediaPlayer.start();
    }
}
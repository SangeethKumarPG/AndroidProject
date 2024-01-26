package com.sangeeth.applifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCrete() method called!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        // Start animation or ui related tasks
        super.onStart();
        Toast.makeText(this,
                "onStart() method called!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Start sensors location update etc
        Toast.makeText(this,
                "onResume() method called!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Release resources or pause ongoing operations
        Toast.makeText(this,
                "onPause() method called!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Release resources, save data etc
        Toast.makeText(this,
                "onStop() method called!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Perform any necessary restart task
        Toast.makeText(this,
                "onRestart() method called!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clean up resources finalize tasks
        Toast.makeText(this,
                "onDestroy() method called!",
                Toast.LENGTH_SHORT).show();
    }
}
package com.sangeeth.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    MyCustomAdapter myCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.grid);
        shapeArrayList = new ArrayList<>();
        shapeArrayList.add(new Shape(R.drawable.sphere,"Sphere"));
        shapeArrayList.add(new Shape(R.drawable.cylinder, "Cylinder"));
        shapeArrayList.add(new Shape(R.drawable.cube,"Cube"));
        shapeArrayList.add(new Shape(R.drawable.prism,"Prism"));

        myCustomAdapter = new MyCustomAdapter(getApplicationContext(), shapeArrayList);
        gridView.setAdapter(myCustomAdapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(),"Position: "+position,Toast.LENGTH_LONG).show();
                    if (position == 0) {
                        Intent i = new Intent(getApplicationContext(), Sphere.class);
                        startActivity(i);
                    } else if (position == 2) {
                        Intent i = new Intent(getApplicationContext(), Cube.class);
                        startActivity(i);
                    } else if (position == 1) {
                        Intent i = new Intent(getApplicationContext(), Cylinder.class);
                        startActivity(i);
                    } else if (position == 3) {
                        Intent i = new Intent(getApplicationContext(), Prism.class);
                        startActivity(i);
                    }
            }
        });
    }
}
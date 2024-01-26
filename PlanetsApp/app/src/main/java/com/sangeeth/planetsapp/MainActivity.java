        package com.sangeeth.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

        public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyCustomAdapter adapter;

    ArrayList<Planet> planetArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        planetArrayList = new ArrayList<>();
        planetArrayList.add(new Planet("Earth","1 moon", R.drawable.earth));
        planetArrayList.add(new Planet("Mercury","0 moons", R.drawable.mercury));
        planetArrayList.add(new Planet("Venus","0 moons", R.drawable.venus));
        planetArrayList.add(new Planet("Mars","2 moons", R.drawable.mars));
        planetArrayList.add(new Planet("Jupiter","79 moons", R.drawable.jupiter));
        planetArrayList.add(new Planet("Saturn","83 moons", R.drawable.saturn));
        planetArrayList.add(new Planet("Uranus","27 moons", R.drawable.uranus));
        planetArrayList.add(new Planet("Neptune","14 moons", R.drawable.neptune));
        planetArrayList.add(new Planet("Pluto","0 moons",R.drawable.pluto));

        adapter = new MyCustomAdapter(getApplicationContext(), planetArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        "Planet Name : "+adapter.getItem(position).getPlanetName(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
package com.sangeeth.adaptersapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //List view is a adapter view
        listView = findViewById(R.id.listview);
        //Adapter acts as bridge between datasource and the UI

        //Data Source
        String[] countries = {"USA","INDIA","JAPAN","UK"};

        //Adapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                countries);

        //Custom Adapter
        MyCustomAdapter adapter = new MyCustomAdapter(this,countries);


        //Link the adapter with list view
        listView.setAdapter(adapter);
    }
}
package com.sangeeth.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView recyclerView;
    List<Item> itemList;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();

        itemList.add(new Item(R.drawable.fruit,"Fruits","Fresh fruits from the garden"));
        itemList.add(new Item(R.drawable.vegitables, "Vegetables","Delicious Vegetables"));
        itemList.add(new Item(R.drawable.bread, "Bakery","Bread, Wheat and Beans"));
        itemList.add(new Item(R.drawable.beverage,"Beverage","Juice, Tea, Coffee and Soda"));
        itemList.add(new Item(R.drawable.milk, "Milk","Milk shakes and yogurt"));
        itemList.add(new Item(R.drawable.popcorn,"Snacks","Popcorn, Donut and Drinks"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setClickListener(this);


    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this,"You chose : "+itemList.get(pos).getItemName(),Toast.LENGTH_LONG).show();
    }
}
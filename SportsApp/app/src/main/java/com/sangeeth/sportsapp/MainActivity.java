package com.sangeeth.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView recyclerView;
    private List<Sport> sportList;

    private CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();

        sportList.add(new Sport("Football",R.drawable.football));
        sportList.add(new Sport("BasketBall",R.drawable.basketball));
        sportList.add(new Sport("Tennis",R.drawable.tennis));
        sportList.add(new Sport("Volley",R.drawable.volley));
        sportList.add(new Sport("Ping Pong",R.drawable.ping));

        customAdapter = new CustomAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);
        customAdapter.setClickListener(this);

    }

    @Override
    public void onClick(View v, int position) {
        Toast.makeText(getApplicationContext(),"You selected : "+sportList.get(position).getSportName(),Toast.LENGTH_SHORT).show();
    }
}
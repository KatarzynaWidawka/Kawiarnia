package com.example.widaw.kawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);
        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Latte"));
        coffees.add(new Coffee("Latte smakowe"));
        coffees.add(new Coffee("Cappucino"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        CoffeeAdapter coffeeAdapter = new CoffeeAdapter(coffees);
        recyclerView.setAdapter(coffeeAdapter);
    }
}

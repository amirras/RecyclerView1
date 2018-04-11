package com.example.android.myapplicationrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.myapplicationrecyclerview.adapters.CarsAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCars;
    CarsAdapter carsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCars = (RecyclerView) findViewById(R.id.rcCars);
        carsAdapter = new CarsAdapter(getApplicationContext());

        rvCars.setAdapter(carsAdapter);

        rvCars.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}

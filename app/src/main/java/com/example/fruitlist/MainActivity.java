package com.example.fruitlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Fruits> fruitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        fruitList = new ArrayList<>();

        // Add some fruits to the list
        fruitList.add(new Fruits("ORANGE"));
        fruitList.add(new Fruits("APPLE"));
        fruitList.add(new Fruits("BANANA"));
        fruitList.add(new Fruits("MANGO"));
        fruitList.add(new Fruits("STRAWBERRY "));
        fruitList.add(new Fruits("WATERMELON"));
        fruitList.add(new Fruits("PEACH"));

        // Create a new adapter and set it to the RecyclerView
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

        // Set the layout manager for the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

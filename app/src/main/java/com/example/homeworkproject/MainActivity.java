package com.example.homeworkproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    //The Adapter is the bridge b/w the ArrayList of Data and the RecyclerView above
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.whop, "Bopper"));
        exampleList.add(new ExampleItem(R.drawable.doub, "Double Bopper"));
        exampleList.add(new ExampleItem(R.drawable.chick, "Chicken Burger"));
        exampleList.add(new ExampleItem(R.drawable.veg, "Veggie Burger"));
        exampleList.add(new ExampleItem(R.drawable.cheese, "Cheeseburger"));
        exampleList.add(new ExampleItem(R.drawable.bbq, "BBQ Cheeseburger"));
        exampleList.add(new ExampleItem(R.drawable.lamb, "Lamb Burger"));
        exampleList.add(new ExampleItem(R.drawable.fish, "Fish Burger"));
        exampleList.add(new ExampleItem(R.drawable.angus, "Angus Burger"));
        exampleList.add(new ExampleItem(R.drawable.saus, "Sausage BopMuffin"));
        exampleList.add(new ExampleItem(R.drawable.egg, "Sausage n Egg BopMuffin"));
        exampleList.add(new ExampleItem(R.drawable.chip, "Chips"));
        exampleList.add(new ExampleItem(R.drawable.water, "Water"));
        exampleList.add(new ExampleItem(R.drawable.dew, "Mountain Dew"));
        exampleList.add(new ExampleItem(R.drawable.fanta, "Fanta"));






        mRecyclerView = findViewById(R.id.recyclerView);
        //the xml file


        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}

package com.example.homeworkproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView foodTextView;
    private ImageView imageView;
    private TextView priceTextView;
    private TextView descriptionTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);


        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);

        Food food = FoodDatabase.getFoodById(foodID);


        foodTextView = findViewById(R.id.detailFood;
        imageView = findViewById(R.id.detailImage);
        priceTextView = findViewById(R.id.detailPrice);
        descriptionTextView = findViewById(R.id.detailDescription);


        foodTextView.setText(food.getFoodTitle());
        priceTextView.setText((int) food.getPrice());
        descriptionTextView.setText(food.getDescription());


        imageView.setImageResource(food.getImageDrawableId());



    }
}

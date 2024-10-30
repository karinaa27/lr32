package com.mgke.lr32;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.foods);
        ListView listFood = findViewById(R.id.list_foods);
        listFood.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listDrinks1, itemView, position, id) -> {
            Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
            intent.putExtra(FoodActivity.EXTRA_FOODID, (int) id);
            startActivity(intent);
        };
        listFood.setOnItemClickListener(itemClickListener);
    }
}
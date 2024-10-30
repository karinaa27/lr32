package com.mgke.lr32;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AdapterView.OnItemClickListener itemClickListener = (listView, itemView, position, id) -> {
        Intent intent = null;

        switch (position) {
            case 0:
                intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                break;
            case 1:
                intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                break;
            case 2:
                intent = new Intent(MainActivity.this, RestoranCategoryActivity.class);
                break;
        }

        startActivity(intent);
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
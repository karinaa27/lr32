package com.mgke.lr32;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class RestoranCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoran_category);

        ArrayAdapter<Restorans> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Restorans.restorans);
        ListView listRestoran = findViewById(R.id.list_restoran);
        listRestoran.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listDrinks1, itemView, position, id) -> {
            Intent intent = new Intent(RestoranCategoryActivity.this, RestoranActivity.class);
            intent.putExtra(RestoranActivity.EXTRA_RESTORANID, (int) id);
            startActivity(intent);
        };
        listRestoran.setOnItemClickListener(itemClickListener);
    }
}
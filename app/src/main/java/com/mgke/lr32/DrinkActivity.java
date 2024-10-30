package com.mgke.lr32;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";
    private CoffeeDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        dbHelper = new CoffeeDatabaseHelper(this);
        int drinkId = getIntent().getIntExtra(EXTRA_DRINKID, -1);

        // Получаем список напитков из базы данных
        List<Drink> drinks = dbHelper.getAllDrinks();

        if (drinkId != -1 && drinkId < drinks.size()) {
            Drink drink = drinks.get(drinkId);

            TextView name = findViewById(R.id.name);
            name.setText(drink.getName());

            TextView description = findViewById(R.id.description);
            description.setText(drink.getDescription());

            ImageView photo = findViewById(R.id.photo);
            photo.setImageResource(drink.getImageResourceId());
            photo.setContentDescription(drink.getName());
        }
    }
}
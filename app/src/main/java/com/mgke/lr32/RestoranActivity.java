package com.mgke.lr32;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RestoranActivity extends AppCompatActivity {

    public static final String EXTRA_RESTORANID = "restoran_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoran);

        int restoranId = (Integer) getIntent().getExtras().get(EXTRA_RESTORANID);
        Restorans restorans = Restorans.restorans[restoranId];

        TextView name = findViewById(R.id.name);
        name.setText(restorans.getName());

        TextView description = findViewById(R.id.description);
        description.setText(restorans.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(restorans.getImageResourceId());
        photo.setContentDescription(restorans.getName());
    }
}
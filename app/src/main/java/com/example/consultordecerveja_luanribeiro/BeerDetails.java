package com.example.consultordecerveja_luanribeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("MissingInflatedId")
public class BeerDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_details);

        Button backButton = findViewById(R.id.backButton2);
        TextView beerName = findViewById(R.id.beer_name);
        TextView beerMaker = findViewById(R.id.beer_maker);
        TextView beerOrigin = findViewById(R.id.origin);
        TextView beerCreation = findViewById(R.id.creationYear);
        TextView beerType = findViewById(R.id.beerType);
        TextView beerPrice = findViewById(R.id.price);
        ImageView beerPicture = findViewById(R.id.beer_img);

        String name = getIntent().getStringExtra("beer_name");
        String maker = getIntent().getStringExtra("beer_maker");
        String origin = getIntent().getStringExtra("beer_origin");
        String creation = getIntent().getStringExtra("beer_year");
        String type = getIntent().getStringExtra("beer_type");
        int image = getIntent().getIntExtra("beer_picture", 0);
        String price = getIntent().getStringExtra("beer_price");

        beerName.setText(name);
        beerMaker.setText(maker);
        beerOrigin.setText(origin);
        beerCreation.setText(creation);
        beerType.setText(type);
        beerPicture.setImageResource(image);
        beerPrice.setText(price);

        backButton.setOnClickListener(view -> this.finish());
    }
}
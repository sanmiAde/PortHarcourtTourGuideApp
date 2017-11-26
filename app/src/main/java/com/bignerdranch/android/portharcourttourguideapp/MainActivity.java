package com.bignerdranch.android.portharcourttourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurantTxtView = findViewById(R.id.restaurantTxt);
        restaurantTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResturantActivity.class);

                startActivity(intent);
            }
        });

        TextView parksTxtView = findViewById(R.id.parksTxt);
        parksTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ParksActivity.class);

                startActivity(intent);
            }
        });

        TextView historicalTxtView = findViewById(R.id.historicalTxt);
        historicalTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HistoricalSitesActivity.class);

                startActivity(intent);
            }
        });

        TextView cinemasTxtView = findViewById(R.id.cinemaTxt);
        cinemasTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CinemasActivity.class);

                startActivity(intent);
            }
        });

    }
}

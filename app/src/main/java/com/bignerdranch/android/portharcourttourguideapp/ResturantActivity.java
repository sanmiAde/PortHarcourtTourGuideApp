package com.bignerdranch.android.portharcourttourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ResturantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list_item);


        ArrayList<Location>  restaurantLocation = new ArrayList<>();

        restaurantLocation.add(new Location("Genesis1",00012344, "number ", "sanmrufdbjfdbkdkbs", 999));
        restaurantLocation.add(new Location("Genesis2",000223232, "number ", "sanmrufdbjfdbkdkbs", 999));
        restaurantLocation.add(new Location("Genesis3",00000000023200, "number ", "sanmrufdbjfdbkdkbs", 999));
        restaurantLocation.add(new Location("Genesis4",0000000230032200, "number ", "sanmrufdbjfdbkdkbs", 999));
        restaurantLocation.add(new Location("Genesis5",000000023220000, "number ", "sanmrufdbjfdbkdkbs", 999));
        restaurantLocation.add(new Location("Genesis6",0000002323400000, "number ", "sanmrufdbjfdbkdkbs", 999));

        LocationAdapter restaurantAdapter = new LocationAdapter(this, restaurantLocation);

        ListView restaurantListView = (ListView) findViewById(R.id.location_listView);

        restaurantListView.setAdapter(restaurantAdapter);

    }
}

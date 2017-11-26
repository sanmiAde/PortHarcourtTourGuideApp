package com.bignerdranch.android.portharcourttourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP DV6 on 25/11/2017.
 */


/*
* {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Location} objects.
* */

public class LocationAdapter  extends ArrayAdapter<Location>{

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    /***
     *
     *
     * @param context The current context. Used to inflate the layout file.
     * @param locations A list of Location objects to display in a list.
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations){

        //second argument is set to zero because it's a custom adapter with more than one views.
        super(context, 0, locations);

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_location_item_list, parent, false);


        }

        Location currentLocatoin = getItem(position);

        TextView nameOflocation = listItemView.findViewById(R.id.name_txt);
        nameOflocation.setText(currentLocatoin.getName());

        TextView addressOfLocation = listItemView.findViewById(R.id.address_txt);
        addressOfLocation.setText(currentLocatoin.getAddress());

        TextView phoneNumberOfLocation = listItemView.findViewById(R.id.phone_number_txt);
        phoneNumberOfLocation.setText(String.valueOf(currentLocatoin.getPhoneNumber()));

        TextView detailsLocation = listItemView.findViewById(R.id.details_txt);
        detailsLocation.setText(currentLocatoin.getDetails());

        return listItemView;
    }
}
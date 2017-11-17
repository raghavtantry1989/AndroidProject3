package com.example.tantryr.puneguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tantryr on 11/17/17.
 */

public class HotelsAdapter extends ArrayAdapter<Hotel> {

    private int mColorResourceId;

    public HotelsAdapter(@NonNull Context context, @NonNull ArrayList<Hotel> hotels, int colorResourceId) {
        super(context, 0, hotels);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hotels_list_item,parent,false);
        }

        Hotel currentHotel = getItem(position);

        TextView hotelName = listItemView.findViewById(R.id.hotel_name);
        hotelName.setText(currentHotel.getName());

        TextView hotelDescription = listItemView.findViewById(R.id.hotel_description);
        hotelDescription.setText(currentHotel.getDescription());

        TextView hotelRatings = listItemView.findViewById(R.id.hotel_ratings);
        hotelRatings.setText(currentHotel.getRatings());

        TextView hotelCost = listItemView.findViewById(R.id.hotel_cost);
        hotelCost.setText(currentHotel.getCostPerDay());

        ImageView image = listItemView.findViewById(R.id.hotel_image);
        image.setImageResource(currentHotel.getImageResourceId());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.hotel_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

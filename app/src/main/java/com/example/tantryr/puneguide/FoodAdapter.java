package com.example.tantryr.puneguide;

import android.content.Context;
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

/**
 * Created by tantryr on 11/17/17.
 */

public class FoodAdapter extends ArrayAdapter<Food> {
    private int mColorResourceId;

    public FoodAdapter(@NonNull Context context, @NonNull ArrayList<Food> foods, int colorResourceId) {
        super(context, 0, foods);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.general_list_item,parent,false);
        }
        Food currentRestaurant = getItem(position);

        TextView nameView = listItemView.findViewById(R.id.name_view);
        nameView.setText(currentRestaurant.getName());

        TextView descView = listItemView.findViewById(R.id.desc_view);
        descView.setText(currentRestaurant.getAddress());

        ImageView image = listItemView.findViewById(R.id.image_view);
        image.setImageResource(currentRestaurant.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.general_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

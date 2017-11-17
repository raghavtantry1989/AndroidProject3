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
 * Created by tantryr on 11/16/17.
 */

public class SightsAdapter extends ArrayAdapter<Sight> {
    private int mColorResourceId;

    public SightsAdapter(Context context, ArrayList<Sight> sights, int colorResourceId){
        super(context,0,sights);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sight_list_item, parent, false);
        }
        Sight currentSight = getItem(position);

        TextView sightName = listItemView.findViewById(R.id.sight_name);
        sightName.setText(currentSight.getName());

        TextView sightShortDescription = listItemView.findViewById(R.id.sight_short_description);
        sightShortDescription.setText(currentSight.getShortDescription());

        ImageView image = listItemView.findViewById(R.id.sight_image);
        image.setImageResource(currentSight.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.sight_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

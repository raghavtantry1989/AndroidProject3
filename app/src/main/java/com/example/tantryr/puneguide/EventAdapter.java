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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tantryr on 11/17/17.
 */

public class EventAdapter extends ArrayAdapter<Event> {
    private int mColorResourceId;
    public EventAdapter(@NonNull Context context, @NonNull ArrayList<Event> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.events_list_item,parent,false);
        }
        Event currentEvent = getItem(position);

        TextView eventName = listItemView.findViewById(R.id.event_name);
        eventName.setText(currentEvent.getEventName());

        TextView eventDate = listItemView.findViewById(R.id.event_date);
        eventDate.setText(currentEvent.getEventDate());

        TextView eventTime = listItemView.findViewById(R.id.event_time);
        eventTime.setText(currentEvent.getEventTime());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.events_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

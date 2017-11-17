package com.example.tantryr.puneguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list_view,container,false);

        ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("IDP's UK Education Fair","Wed, 22 Nov", "1:00 PM"));
        events.add(new Event("Pune City Festival","Wed, 20 Nov", "5:00 PM"));
        events.add(new Event("Kick Off Fifa 18 Word Cup","Wed, 19 Nov", "1:00 PM"));
        events.add(new Event("Classic Comedy Nights","Wed, 19 Nov", "3:30 PM"));
        events.add(new Event("Scuba Diving at Konkan","Wed, 18 Nov", "3:30 PM"));
        events.add(new Event("Mirchi Live with Vidya VOX","Wed, 17 Nov", "2:30 PM"));

        EventAdapter adapter = new EventAdapter(getContext(),events,R.color.category_events);
        ListView listView = rootView.findViewById(R.id.general_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

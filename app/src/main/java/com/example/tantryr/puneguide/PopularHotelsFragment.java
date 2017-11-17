package com.example.tantryr.puneguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PopularHotelsFragment extends Fragment {


    public PopularHotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.general_list_view,container,false);

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel(
                "Caspia Hotel - Pune",
                "4-star hotel",
                "Straightforward rooms in a modern budget hotel, offering multi-cuisine restaurant & a 24/7 gym.",
                "Rs.3500",
                R.drawable.caspia_hotel
        ));

        hotels.add(new Hotel(
                "The O Hotel",
                "5-star hotel",
                "Polished rooms & suites in an upmarket lodging featuring 3 restaurants & a rooftop pool.",
                "Rs.4800",
                R.drawable.o_hotel
        ));

        hotels.add(new Hotel(
                "Hotel Sagar Plaza",
                "4-star hotel",
                "Polished venue featuring refined rooms & suites, plus a colourful eatery, a sports bar & a pool.",
                "Rs.4423",
                R.drawable.sagar_plaza
        ));

        hotels.add(new Hotel(
                "E-Square",
                "5-star hotel",
                "Polished property offering multiple eateries, plus a gym, a spa & a rooftop pool..",
                "Rs.3074",
                R.drawable.e_square
        ));

        hotels.add(new Hotel(
                "St Laurn Business Hotels",
                "4-star hotel",
                "Contemporary business hotel offering 24-hour dining & room service, as well as a rooftop pool.",
                "Rs.3362",
                R.drawable.laurn_hotels
        ));

        HotelsAdapter adapter = new HotelsAdapter(getContext(),hotels,R.color.category_hotels);
        ListView listView = rootView.findViewById(R.id.general_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

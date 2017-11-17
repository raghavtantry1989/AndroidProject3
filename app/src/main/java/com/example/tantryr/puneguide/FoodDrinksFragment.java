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
public class FoodDrinksFragment extends Fragment {


    public FoodDrinksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list_view,container,false);

        ArrayList<Food> foods = new ArrayList<Food>();

        foods.add(new Food("Exotica Pune",
                "Panchshil Tech Park, Near Pune Golf Course, Tower C.",
                R.drawable.exotica));

        foods.add(new Food("Baan Tao",
                "Hyatt Pune,Adjacent to Aga Khan Palace,88, Pune Nagar Road, Kalyani Nagar.",
                R.drawable.baan_tao));

        foods.add(new Food("Prem's Restaurant",
                "Opposite Lane 3, North Main Road, Koregaon Park.",
                R.drawable.prems));

        foods.add(new Food("Dario's Restaurant",
                "Lane 1, No.19, Vasani Nagar, Koregaon Park, Opposite Osho Ashram",
                R.drawable.darios));

        foods.add(new Food("Chingari",
                "Sheraton Grand, Raja Bahadur Mill Road,Sangamvadi.",
                R.drawable.chingari));

        foods.add(new Food("Sante Spa Cuisine",
                "Next to Osho International, Lane 1, Koregaon Park, Pune.",
                R.drawable.sante));

        foods.add(new Food("Mystic Masala Restaurant",
                "Vivanta by Taj - Blue Diamond, 11 Koregaon Road.",
                R.drawable.masala));

        foods.add(new Food("Eighty Eighty",
                "Adjacent to Aga Khan Palace, Pune Nagar Rd, Nilanjali Housing Colony, Kalyani Nagar, Pune.",
                R.drawable.eighty));

        FoodAdapter adapter = new FoodAdapter(getContext(),foods,R.color.category_food);
        ListView listView = rootView.findViewById(R.id.general_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

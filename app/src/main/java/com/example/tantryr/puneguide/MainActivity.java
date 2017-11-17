package com.example.tantryr.puneguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Top Sights Link
        TextView topSightsView = (TextView) findViewById(R.id.topSightsTextView);
        topSightsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topSightsIntent = new Intent(MainActivity.this,TopSightsActivity.class);
                startActivity(topSightsIntent);
            }
        });

        // Popular Hotels
        TextView popularHotelsView = (TextView) findViewById(R.id.popularHotelsTextView);
        popularHotelsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popularHotelsIntent = new Intent(MainActivity.this,PopularHotelsActivity.class);
                startActivity(popularHotelsIntent);
            }
        });

        // Food And Drink
        TextView foodDrinksView = (TextView) findViewById(R.id.foodTextView);
        foodDrinksView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodDrinksIntent = new Intent(MainActivity.this,FoodDrinksActivity.class);
                startActivity(foodDrinksIntent);
            }
        });

        // Events and Activities
        TextView eventsActivitiesView = (TextView) findViewById(R.id.eventsTextView);
        eventsActivitiesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(MainActivity.this,EventsActivity.class);
                startActivity(eventsIntent);
            }
        });


    }
}

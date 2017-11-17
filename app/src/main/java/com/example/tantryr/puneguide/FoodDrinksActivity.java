package com.example.tantryr.puneguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FoodDrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FoodDrinksFragment())
                .commit();
    }
}

package com.example.tantryr.puneguide;

/**
 * Created by tantryr on 11/17/17.
 */

public class Hotel {
    private String name;
    private String ratings;
    private String description;
    private String costPerDay;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Hotel(String name, String ratings, String description, String costPerDay, int imageResourceId) {
        this.name = name;
        this.ratings = ratings;
        this.description = description;
        this.costPerDay = costPerDay;
        this.mImageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getRatings() {
        return ratings;
    }

    public String getDescription() {
        return description;
    }

    public String getCostPerDay() {
        return costPerDay;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

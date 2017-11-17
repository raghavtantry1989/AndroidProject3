package com.example.tantryr.puneguide;

/**
 * Created by tantryr on 11/17/17.
 */

public class Food {
    private String name;
    private String address;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Food(String name, String address, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.mImageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

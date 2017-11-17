package com.example.tantryr.puneguide;

/**
 * Created by tantryr on 11/16/17.
 */

public class Sight {
    private String name;
    private String shortDescription;
    private String longDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Sight(String name, String shortDescription, String longDescription, int imageResourceId) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.mImageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        String shortDesc = shortDescription.substring(0, Math.min(shortDescription.length(), 32)) + "...";
        return shortDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getLongDescription() {
        return longDescription;
    }
}

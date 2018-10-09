package com.example.android.tourguide;

public class Morocco {
    // State
    //** City resource ID
    private int cityId = NO_CITY_PROVIDED;
    //** Name resource ID
    private int nameId;
    //** Image resource ID
    private int imageId;
    //** Represents the no city state
    private static final int NO_CITY_PROVIDED = -1;

    //Constructor #1 to create objects for the Sites Fragment
    public Morocco(int name, int city, int image) {
        nameId = name;
        cityId = city;
        imageId = image;
    }

    //Constructor #2 to create objects for the other Fragments
    public Morocco(int name, int image) {
        nameId = name;
        imageId = image;
    }

    //Methods
    //** Get the String resource ID of the city
    public int getCityId() {
        return cityId;
    }

    //** Get the String resource ID of the name
    public int getNameId() {
        return nameId;
    }

    //** Get the resource ID of the image
    public int getImageId() {
        return imageId;
    }

    //** Check if the the item has a city name or not
    public boolean hasCity() {
        return cityId != NO_CITY_PROVIDED;
    }
}

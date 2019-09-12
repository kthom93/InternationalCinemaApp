package com.kthom93.internationalcinemaapp;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by kevin on 12/5/2017.
 */

public class Movie {
    private String title = null;

    private int minutes = 0;
    private int year = 0;

    private double tomatoes = 0;

    private double latitude = 0;
    private double longitude = 0;


    public Movie(String title, int minutes, int year, double tomatoes, double latitude, double longitude) {
        this.title = title;
        this.minutes = minutes;
        this.year = year;
        this.tomatoes = tomatoes;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LatLng getLatLng() {
        return new LatLng(latitude, longitude);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(double tomatoes) {
        this.tomatoes = tomatoes;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return Integer.toString(year);
    }

    public String getRating() {
        return Double.toString(tomatoes) + "%";
    }
}

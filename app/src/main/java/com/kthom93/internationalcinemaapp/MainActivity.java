package com.kthom93.internationalcinemaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

import static com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_AZURE;
import static com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ORANGE;
import static com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker;

public class MainActivity extends AppCompatActivity {

    private GoogleMap map = null;
    private TextView textView = null;
    private Model model = null;

    private LinearLayout ratingLayout = null;
    private Map<Marker, Movie> movieMap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = Model.getInstance();
        movieMap = new HashMap<>();

        ratingLayout = (LinearLayout) findViewById(R.id.ratings);
        textView = (TextView) findViewById(R.id.text);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                map = googleMap;
                initMap();
            }
        });

        ratingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RatingsActivity.class);
                startActivity(intent);
            }
        });
    }

    void initMap() {
        addMarkers();
        //setMarkerListener();
        //drawLines();
    }

    void setMapType() {
        //map.setMapType(mapType);
    }

    void addMarkers() {
        for (Movie movie : model.getMovies()) {
            addMarker(movie);
        }
        for (Movie movie : model.getMovies2()) {
            addMarker2(movie);
        }
    }

    void addMarker(Movie movie) {
        MarkerOptions options = new MarkerOptions().position(movie.getLatLng()).title(movie.getTitle()).icon(defaultMarker(HUE_AZURE));
        Marker marker = map.addMarker(options);
        movieMap.put(marker, movie);
    }

    void addMarker2(Movie movie) {
        MarkerOptions options = new MarkerOptions().position(movie.getLatLng()).title(movie.getTitle()).icon(defaultMarker(HUE_ORANGE));
        Marker marker = map.addMarker(options);
        movieMap.put(marker, movie);
    }

    void setMarkerListener() {

    }

    void drawLines() {

    }

}

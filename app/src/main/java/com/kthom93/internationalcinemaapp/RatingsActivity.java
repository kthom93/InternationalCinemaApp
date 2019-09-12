package com.kthom93.internationalcinemaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RatingsActivity extends AppCompatActivity {
    private RecyclerView ratingsRecyclerView = null;
    private List<Movie> ratingsList = null;
    private Model model;
    private RatingsAdapter ratingsAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);

        model = Model.getInstance();
        ratingsList = model.getRatings();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ratingsRecyclerView = (RecyclerView) findViewById(R.id.ratings_view);

        ratingsRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ratingsAdapter = new RatingsAdapter(ratingsList);
        ratingsRecyclerView.setAdapter(ratingsAdapter);
    }




    private class RatingsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title = null;
        private TextView description = null;
        private TextView percentage = null;


        public RatingsViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.ratings_title);
            description = (TextView) v.findViewById(R.id.ratings_descripton);
            percentage = (TextView) v.findViewById(R.id.ratings_percentage);
        }

        public void bind(Movie movie) {
            title.setText(movie.getTitle());
            description.setText(movie.getDescription());
            percentage.setText(movie.getRating());
        }


        @Override
        public void onClick(View v) {

        }
    }


    private class RatingsAdapter extends RecyclerView.Adapter<RatingsActivity.RatingsViewHolder> {
        private List<Movie> items;

        public RatingsAdapter(List<Movie> displayObjects) {
            items = displayObjects;
        }

        @Override
        public RatingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ratings, parent, false);
            return new RatingsActivity.RatingsViewHolder(v);
        }

        @Override
        public void onBindViewHolder(RatingsViewHolder holder, int position) {
            Movie movie = ratingsList.get(position);
            holder.bind(movie);
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }

}

package com.android.serverwarrior.reclycerviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MoviesAdapter mAdapter;
    private List<Movie> moviesList = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
//        setSupportActionBar( toolbar );

        recyclerView = ( RecyclerView ) findViewById( R.id.recycler_view );

        mAdapter = new MoviesAdapter(moviesList);
        prepareMovieData();
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager( getApplicationContext() );
        recyclerView.setLayoutManager( mLayoutManager );
        recyclerView.setItemAnimator( new DefaultItemAnimator());
        recyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayoutManager.VERTICAL ) );
        recyclerView.setAdapter( mAdapter );


    }

    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
        moviesList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
        moviesList.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        moviesList.add(movie);

        movie = new Movie("Shaun the Sheep", "Animation", "2015");
        moviesList.add(movie);

        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
        moviesList.add(movie);

        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
        moviesList.add(movie);

        movie = new Movie("Up", "Animation", "2009");
        moviesList.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "2009");
        moviesList.add(movie);

        movie = new Movie("The LEGO Movie", "Animation", "2014");
        moviesList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        moviesList.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986");
        moviesList.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000");
        moviesList.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        moviesList.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
        moviesList.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        moviesList.add(movie);

        movie = new Movie( "Guardians of the Galaxy", "Science Fiction & Fantasy", "2014" );
        moviesList.add( movie );
        Log.v("Main Activity", "movie count " + moviesList.size());
        mAdapter.notifyDataSetChanged();
    }
}

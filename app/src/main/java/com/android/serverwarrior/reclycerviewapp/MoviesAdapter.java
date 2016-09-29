package com.android.serverwarrior.reclycerviewapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Server Warrior on 9/11/2016.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> moviesList;

    public MoviesAdapter(List<Movie> myMoviesList){
        this.moviesList = myMoviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from( parent.getContext() ).inflate(R.layout.moive_list_row, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get( position );
        holder.title.setText( movie.getTitle() );
        holder.genre.setText( movie.getGenre() );
        holder.year.setText( movie.getYear() );
    }

    /**
     * Returns the total number of items in the data set hold by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = ( TextView ) itemView.findViewById( R.id.title );
            genre = ( TextView ) itemView.findViewById( R.id.genre );
            year = ( TextView ) itemView.findViewById( R.id.year );
        }
    }

}

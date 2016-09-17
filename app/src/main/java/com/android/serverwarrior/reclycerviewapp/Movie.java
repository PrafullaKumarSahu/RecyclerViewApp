package com.android.serverwarrior.reclycerviewapp;

/**
 * Created by Server Warrior on 9/10/2016.
 */
public class Movie {
    private String title, genre, year;

    /**
     * Default Constructor
     * */
    public Movie()
    {
        //
    }

    /**
     * Parametrise constructor
     * */
    public Movie( String title, String genre, String year )
    {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
    public String getYear()
    {
       return year;
    }
    public void setTitle()
    {
        this.title = title;
    }
    public void setGenre()
    {
        this.genre = genre;
    }
    public  void setYear()
    {
        this.year = year;
    }
}

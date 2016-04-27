package com.epicodus.mymoviefinder.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Guest on 4/27/16.
 */
public class Movie {
    private String mMovieName;
    private String mMoviePoster;
//    private String mMovieSynopsis;
//    private String mMovieDirector;
//    private ArrayList<String> mActors = new ArrayList<>();

    public Movie(String mMovieName, String mMoviePoster) {
        this.mMovieName = mMovieName;
        this.mMoviePoster = mMoviePoster;
    }


//    public Movie (String movieName, String moviePoster, ArrayList<String> actors) {
//        this.mMovieName = movieName;
//        this.mMoviePoster = moviePoster;
////        this.mMovieSynopsis = movieSynopsis;
////        this.mMovieDirector = movieDirector;
//        this.mActors = actors;
//    }
//
    public String getMovieName() {
        return mMovieName;
    }
//    public String getMoviePoster() {
//        return mMoviePoster;
//    }
//    public String getMovieSynopsis() {
//        return mMovieSynopsis;
//    }
//    public String getMovieDirector() {
//        return mMovieDirector;
//    }
//    public ArrayList<String> getActors() {
//        return mActors;
//    }
}

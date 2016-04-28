package com.epicodus.mymoviefinder.models;

import org.parceler.Parcel;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Guest on 4/27/16.
 */
@Parcel
public class Movie {
    String mMovieName;
    String mMoviePoster;
//    private String mMovieSynopsis;
//    private String mMovieDirector;
//    private ArrayList<String> mActors = new ArrayList<>();

    public Movie() {}

    public Movie(String mMovieName, String mMoviePoster) {
        this.mMovieName = mMovieName;
        this.mMoviePoster = "http://image.tmdb.org/t/p/w500" + mMoviePoster;
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
    public String getMoviePoster() {
        return mMoviePoster;
    }
//    public String getMovieSynopsis() {
//        return mMovieSynopsis;
//    }
//    public String getMovieDirector() {
//        return mMovieDirector;
//    }
//    public ArrayList<String> getActors() {
//        return mActors;
//    }

//    public String getLargePoster(String moviePoster) {
//        String largePoster = moviePoster.substring(2, moviePoster.length() - 6).concat("o.jpg");
//        return largePoster;
//    }
}

package com.epicodus.mymoviefinder.services;

import android.util.Log;

import com.epicodus.mymoviefinder.Constants;
import com.epicodus.mymoviefinder.models.Movie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Guest on 4/27/16.
 */
public class MovieService {
    public static void findMovies(String movieName, Callback callback) {
        String Api_KEY = Constants.API_KEY;


        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.MOVIE_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter("api_key", Api_KEY);
        urlBuilder.addQueryParameter(Constants.MOVIE_QUERY_TITLE_PARAMETER, movieName);

//        String url = urlBuilder.build().toString();
        String url = urlBuilder.build().toString();

        Log.v("URL", url);

        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);

    }

    public ArrayList<Movie> processResults(Response response) {
        ArrayList<Movie> movies = new ArrayList<>();

        try {
            String jsonData = response.body().string();
            if (response.isSuccessful()) {
                JSONObject movieJSON = new JSONObject(jsonData);
                JSONArray resultsJSON = movieJSON.getJSONArray("results");
                for (int i = 0; i < resultsJSON.length(); i++) {
                    JSONObject basicInfoJSON = resultsJSON.getJSONObject(i);
                    String movieName = basicInfoJSON.getString("original_title");
                    String moviePoster = basicInfoJSON.getString("poster_path");


                    Movie movie = new Movie(movieName, moviePoster);
                    movies.add(movie);

                }
            }

        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}


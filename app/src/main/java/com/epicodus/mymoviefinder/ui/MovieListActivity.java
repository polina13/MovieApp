package com.epicodus.mymoviefinder.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.epicodus.mymoviefinder.R;
import com.epicodus.mymoviefinder.services.MovieService;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MovieListActivity extends AppCompatActivity {
    @Bind(R.id.movieTextView) TextView mMovieTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String movieName = intent.getStringExtra("movieName");

        getMovies(movieName);
    }

    private void getMovies(String movieName) {
        final MovieService movieService = new MovieService();

        movieService.findMovies(movieName, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) {


//
            }
        });
    }
}

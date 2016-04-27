package com.epicodus.mymoviefinder.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.mymoviefinder.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.searchMovieButton) Button mSearchMovieButton;
    @Bind(R.id.editText) EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchMovieButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String movieName = mEditText.getText().toString();
        Intent intent = new Intent(MainActivity.this, MovieListActivity.class);
        intent.putExtra("movieName", movieName);
        startActivity(intent);
    }

}


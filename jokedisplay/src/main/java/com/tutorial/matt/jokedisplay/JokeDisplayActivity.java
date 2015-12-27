package com.tutorial.matt.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by matt on 12/25/15.
 */
public class JokeDisplayActivity extends AppCompatActivity {

    private static final String TAG = JokeDisplayActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("JOKE");
        TextView jokeView = (TextView) findViewById(R.id.joke_text);
        jokeView.setText(joke);
    }
}
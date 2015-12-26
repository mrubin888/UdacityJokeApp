package com.tutorial.matt.jokedisplay;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by matt on 12/25/15.
 */
public class JokeDisplayActivity extends AppCompatActivity {

    private static final String TAG = JokeDisplayActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_joke_display);
    }
}
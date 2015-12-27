package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.example.Joker;
import com.tutorial.matt.jokedisplay.JokeDisplayActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static final String TAG = MainActivityFragment.class.getSimpleName();

    private Joker joker;

    public MainActivityFragment() {
        joker = new Joker();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button jokeButton = (Button) root.findViewById(R.id.joke_button);
        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tellJoke(v);
            }
        });
        return root;
    }

    public void tellJoke(View view) {
        new FetchJokeTask(onTaskCompleteListener).execute();
    }

    private OnTaskCompleteListener onTaskCompleteListener = new OnTaskCompleteListener() {
        @Override
        public void onTaskComplete(String result) {
            Intent intent = new Intent(getActivity(), JokeDisplayActivity.class);
            intent.putExtra("JOKE", result);
            startActivity(intent);
        }
    };
}

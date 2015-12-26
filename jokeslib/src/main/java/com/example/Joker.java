package com.example;

import java.util.Random;

public class Joker {
    Random random;

    private String[] jokes = {
            "A neutron walks into a bar and asks, \"How much for a glass of scotch?\" The bartender replies, \"For you, no charge.\"",
            "Schroedinger's cat walks into a bar... and doesn't.",
            "Did you hear oxygen and magnesium got together? OMg!"
    };

    public Joker () {
        random = new Random(System.currentTimeMillis());
    }

    public String getJoke () {
        int index = (int) (random.nextDouble() * jokes.length);
        return jokes[index];
    }
}

package com.example.jsonCheckpoint;

import java.util.List;

public class Movies {
    private List<Movie> movies;



    public Movie getMovies(int i) {
        return movies.get(i);
    }

    public int length(){
        return movies.size();
    }
}

package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;

public class MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieRepository() {
    }

    public void add(Movie movie) {
        movies.add(movie);
    }


}

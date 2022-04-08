package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

    MovieRepository movies = new MovieRepository();
    GoLiveMovieRepository goLiveMovies = new GoLiveMovieRepository();
    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }

    public void register(Movie movie) {
        goLiveMovies.register(movie);
        System.out.println("The movie " + movie.getTitle() + " has been registered.");
    }
}


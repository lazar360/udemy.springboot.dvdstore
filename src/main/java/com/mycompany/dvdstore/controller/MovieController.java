package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {


    public void addUsingConsole() {

        Movie movie = new Movie();
        MovieService movieService = new MovieService();

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Type a film title, please." );
        movie.setTitle(scanner.nextLine());

        System.out.println( "Type a film genre, please." );
        movie.setGenre(scanner.nextLine());

        movieService.register(movie);
        scanner.close();
    }

}

package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Register a new movie
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        MovieController movieController = new MovieController();
        System.out.println("Welcome to the DVD Store !\n Please type 1 for the register method.");
        int chooseOption = parseInt(scanner.nextLine());

        if (chooseOption == 1) {
            movieController.addUsingConsole();
        } else {
            System.out.println("Please type 1 for the register method.");
        }
    }
}

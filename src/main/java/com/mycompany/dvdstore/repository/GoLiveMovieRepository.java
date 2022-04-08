package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository {

    FileWriter writer;

    public void register(Movie movie) {
        try{
            writer = new FileWriter("D:\\workspace.intellijIDEA\\dvdstore\\src\\main\\java\\tmp\\movies.txt",true);
            writer.write(" - " + movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.example.movieworkshoptemplate.repositories;

import com.example.movieworkshoptemplate.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoviesRepository {
    private List<Movie> movies;

    public MoviesRepository() {
        this.movies = new ArrayList<>();
        generateMoviesList();
    }

    private void generateMoviesList() {
        // Læs fra csv file og tilføj hver Movie til Listen
        try {
            Scanner input = new Scanner(new File("C:\\Users\\kutuk\\Documents\\GitHub\\MalikKtK\\2. semester\\MovieWorkshop\\resources\\imdb-data.csv"));
            input.useDelimiter(";|\n");
            while (input.hasNext()) {

                // Year;Length;Title;Subject;Popularity;Awards

                String year = input.next();
                String length = input.next();
                String title = input.next();
                String subject = input.next();
                String popularity = input.next();
                String awards = input.next();

                Movie mo = new Movie(year, length, title, subject, popularity, awards);
                movies.add(mo);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public Movie getOne(int index) {
        return movies.get(index);
    }

    public int getSize() {
        return movies.size();
    }
}

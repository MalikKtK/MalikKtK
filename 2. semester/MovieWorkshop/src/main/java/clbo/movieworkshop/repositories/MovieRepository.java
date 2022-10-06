package clbo.movieworkshop.repositories;

import clbo.movieworkshop.models.Movie;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class MovieRepository {
    List<Movie> movies;

    public MovieRepository() throws FileNotFoundException {
        this.movies = new ArrayList<>();
        // read from csv file
        populateFile();
    }

    private void populateFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/clbo/Tresors/KEA/programmering/Exercises_fall_2022/Ex_movieWorkshop/resources/movies.csv"));
        input.useDelimiter(";|\n");
        while (input.hasNext()){
            String year = input.next();
            String length = input.next();
            String title = input.next();
            String subject = input.next();
            String popularity = input.next();
            String awards = input.next();
            movies.add(new Movie(year, length, title, subject, popularity, awards));
        }
    }

    // readOne
    public Movie read(int id){
        return movies.get(id);
    }

    // readAll
    public List<Movie> readAll(){
        return movies;
    }
}

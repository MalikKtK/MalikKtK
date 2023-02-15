package clbo.movieworkshop.services;

import clbo.movieworkshop.models.Movie;
import clbo.movieworkshop.repositories.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // Exercise 3.2 (show in class)
    public Movie getFirst() {
        return movieRepository.read(1);
    }

    // Exercise 3.3
    public Movie getRandom() {
        return movieRepository.read((int) (Math.random() * movieRepository.readAll().size()));
    }

    // Exercise 3.4 getTenSortByPopularity
    public List<Movie> getTenSortByPopularity() {
        List<Movie> m = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            m.add(getRandom());
        }
        Collections.sort(m);
        return m;
    }

    // Exercise 3.5
    public String howManyWonAnAward(){
        List<Movie> awards = new ArrayList<>();
        for(Movie m : movieRepository.readAll()){
            if (m.getAwards().equals("Yes")){
                awards.add(m);
            }
        }
        return "Number of movies that won an award: <b>" + awards.size() + "</b>";
    }

    // Exercise 3.6
    public List<String> filter(String chr, String amount) {
        List<String> filteredList = new ArrayList<>();

        for (Movie m: movieRepository.readAll()) {
            var sum = 0;

            // count all letters 'chr' in the title of the movie
            for(int i = 0; i < m.getTitle().length(); i++){
                if (m.getTitle().charAt(i) == chr.charAt(0)){
                    sum++;
                }
            }

            if(Integer.parseInt(amount) == sum){
                filteredList.add(m.getTitle());
            }
        }
        return filteredList;
    }

    // Exercise 3.7
    @GetMapping("longest")
    public String longest(String g1, String g2 ){

        var g1AvgLength = 0;
        var g1Count = 0;
        var g2AvgLength = 0;
        var g2Count = 0;

        for (Movie m: movieRepository.readAll()) {
            if(m.getSubject().equals(g1)){
                g1AvgLength += Integer.parseInt(m.getLength());
                g1Count++;
            } else if(m.getSubject().equals(g2)) {
                g2AvgLength += Integer.parseInt(m.getLength());
                g2Count++;
            }
        }


        return g1 + "´s movies has an avarage length of " + (g1AvgLength/g1Count) + ", " + g2 + "´s movies has an avarage length of " + (g2AvgLength/g2Count);
    }
}

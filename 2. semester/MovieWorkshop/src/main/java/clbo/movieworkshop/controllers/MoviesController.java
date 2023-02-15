package clbo.movieworkshop.controllers;


import clbo.movieworkshop.models.Movie;
import clbo.movieworkshop.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Exercise 3.1
    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    // Exercise 3.2 (show in class)
    @GetMapping("/getfirst")
    public Movie getFirst(){
        return movieService.getFirst();
    }

    // Exercise 3.3
    @GetMapping("/getrandom")
    public Movie getRandom(){
        return movieService.getRandom();
    }

    // Exercise 3.4
    @GetMapping("/gettensortbypopularity")
    public List<Movie> getTenSortByPopularity(){
        return movieService.getTenSortByPopularity();
    }

    // Exercise 3.5
    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward(){
        return movieService.howManyWonAnAward();
    }

    // Exercise 3.6
    @GetMapping("/filter")
    public List<String> filter(@RequestParam String chr, @RequestParam String amount){
        return movieService.filter(chr, amount);
    }

    @GetMapping("/longest")
    public String longest(@RequestParam String g1, @RequestParam String g2 ){
        return movieService.longest(g1, g2);
    }
}

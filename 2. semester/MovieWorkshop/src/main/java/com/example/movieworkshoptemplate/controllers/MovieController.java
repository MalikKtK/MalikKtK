package com.example.movieworkshoptemplate.controllers;

import com.example.movieworkshoptemplate.models.Movie;
import com.example.movieworkshoptemplate.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
     private MovieService movieService;

    public MovieController() {
        this.movieService = new MovieService();
    }

    //Controller methods
    @GetMapping("/")
    public String index() {
        return "Hello World welcome to my application";
    }

    @GetMapping("/getfirst")
    public Movie getFirst() {
        return movieService.getFirst();
    }
    @GetMapping("/getrandom")
    public Movie getRandom(){
        return movieService.getRandom();
    }
}

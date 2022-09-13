package com.example.movieworkshoptemplate.services;

import com.example.movieworkshoptemplate.models.Movie;
import com.example.movieworkshoptemplate.repositories.MoviesRepository;

import java.util.Random;

public class MovieService {
    private MoviesRepository moviesRepository;
    private Random random;

    public MovieService() {
        this.moviesRepository = new MoviesRepository();
    }


    public Movie getFirst() {
        return moviesRepository.getOne(1);
    }

    public Movie getRandom() {
        return moviesRepository.getOne(random.nextInt(moviesRepository.getSize()));
    }
}

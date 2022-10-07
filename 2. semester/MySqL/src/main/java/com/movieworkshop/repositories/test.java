package com.movieworkshop.repositories;

public class test {
    public static void main(String[] args) {
        StudentsRepository repo = new StudentsRepository();
        MovieDbRepository repoNew = new MovieDbRepository();

        System.out.println(repoNew.getAllMovies());
    }
}

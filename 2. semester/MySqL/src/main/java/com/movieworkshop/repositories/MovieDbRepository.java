package com.movieworkshop.repositories;

import com.movieworkshop.models.MovieNew;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDbRepository {

    private Connection conn = DatabaseConnectionManager.getConn();

    // Get all students fron the database
    public List<MovieNew> getAllMovies() {

        List<MovieNew> movies = new ArrayList<>();

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM mov");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                movies.add(new MovieNew(
                        resultSet.getInt("id"),
                        resultSet.getInt("Year"),
                        resultSet.getInt("Length"),
                        resultSet.getString("Title"),
                        resultSet.getString("Subject"),
                        resultSet.getInt("Popularity"),
                        resultSet.getString("Awards")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return movies;
    }
}
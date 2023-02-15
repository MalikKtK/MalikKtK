package com.movieworkshop.repositories;

import com.movieworkshop.models.Movie;
import com.movieworkshop.models.MovieNew;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDbRepository {

    private Connection conn = DatabaseConnectionManager.getConn();

    // Get all Movies from the database
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
    public MovieNew getMovie(int id) {

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM mov WHERE id = ?");
            psts.setInt(1, id);
            ResultSet resultSet = psts.executeQuery();

            if (resultSet.next()) {
                return new MovieNew(
                        resultSet.getInt("id"),
                        resultSet.getInt("Year"),
                        resultSet.getInt("Length"),
                        resultSet.getString("Title"),
                        resultSet.getString("Subject"),
                        resultSet.getInt("Popularity"),
                        resultSet.getString("Awards"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }

    public void create(MovieNew movie) {
        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO mov (Year, Length, Title, Subject, Popularity, Awards) VALUES (?, ?, ?, ?, ?, ?)");
            psts.setInt(1, movie.getYear());
            psts.setInt(2, movie.getLength());
            psts.setString(3, movie.getTitle());
            psts.setString(4, movie.getSubject());
            psts.setInt(5, movie.getPopularity());
            psts.setString(6, movie.getAwards());
            psts.executeUpdate();

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
}
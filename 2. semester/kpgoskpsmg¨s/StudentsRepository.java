package com.movieworkshop.repositories;

import com.movieworkshop.models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

    private Connection conn = DatabaseConnectionManager.getConn();

    // Get all students fron the database
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("Email"),
                        resultSet.getBoolean("gender")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    public Student getStudent(int id) {

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
            psts.setInt(1, id);
            ResultSet resultSet = psts.executeQuery();

            if (resultSet.next()) {
                return new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("Email"),
                        resultSet.getBoolean("gender")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }
}
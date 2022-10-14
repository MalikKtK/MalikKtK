package com.example.mysql.respository;

import com.example.mysql.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

    private final List<String> students = new ArrayList<>();

     public List<String> getAll(){
         return students;
     }

    private Connection conn = DatabaseConnectionManager.getConnection();


    public List<Student> getAllStudents(){

        List<Student> students = new ArrayList<>();
        try {

            PreparedStatement psts = conn.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()){
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getBoolean("gender")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public Student getStudent(int id){
        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM student WHERE id = ?");
            psts.setInt(1, id);
            ResultSet resultSet = psts.executeQuery();

            if(resultSet.next()){
                return new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getBoolean("gender")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void create(Student student) {

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO student (name, email, gender) VALUES (?,?,?)");
            psts.setString(1, student.getName());
            psts.setString(2, student.getEmail());
            psts.setBoolean(3, student.isGender());
            psts.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}






























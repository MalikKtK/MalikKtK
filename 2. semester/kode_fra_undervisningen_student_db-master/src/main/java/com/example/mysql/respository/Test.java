package com.example.mysql.respository;

public class Test {

    public static void main(String[] args) {

        StudentsRepository repo = new StudentsRepository();

        System.out.println(repo.getAllStudents());
        System.out.println(repo.getStudent(10));
    }


}

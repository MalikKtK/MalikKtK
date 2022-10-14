package com.example.mysql.service;

import com.example.mysql.model.Student;
import com.example.mysql.respository.StudentsRepository;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class StudentService {

    StudentsRepository repo = new StudentsRepository();

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student getStudent(int id){
        return repo.getStudent(id);
    }



    public void create(WebRequest req){
        boolean gender = false;

        if(req.getParameter("gender") == "Mand"){
            gender = true;
        }

        Student student = new Student(req.getParameter("name"),
                req.getParameter("email"),
                gender
        );

        repo.create(student);
    }


}































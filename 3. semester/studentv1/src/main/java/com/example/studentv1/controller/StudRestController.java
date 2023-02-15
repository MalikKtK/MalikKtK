package com.example.studentv1.controller;

import com.example.studentv1.model.Student;
import com.example.studentv1.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class StudRestController {

    @Autowired
    StudentRepository studentRepository;

    // StudentNotFoundException is a class that extends RuntimeException and can be used to throw an exception when a student is not found in the database
    @GetMapping("/stud1/{name}")
    public Student getStud1ByName(@PathVariable String name) {
        return new Student(name);
    }

    // Optional is a class that can be used to return a value or a default value if the value is not present (null)
    @GetMapping("/stud2/{name}")
    public Student getStud2ByName(@PathVariable Optional<String> name) {
        if (name.isPresent())
            return new Student(name.get());
        else
            return new Student("No name");
    }

    // Optional is a class that can be used to return a value or a default value if the value is not present (null)
    @GetMapping("/stud3/{name}")
    public Student getStud3ByName(@PathVariable String name) {
        return studentRepository.findByName(name).orElse(new Student(name + " Not found"));
    }

    // StudentNotFoundException is a class that extends RuntimeException and can be used to throw an exception when a student is not found in the database
    @GetMapping("/stud4/{name}")
    public Student getStud4ByName(@PathVariable String name) {
//        return studentRepository.findByName(name).orElseThrow(() -> new RuntimeException("Student not found"));
        return studentRepository.findByName(name).orElseThrow(() -> new StudentNotFoundException(name));
    }


    // ResponseEntity is a class that can be used to return a response with a status code and a body (the student)
    @GetMapping("/stud5/{name}")
    public ResponseEntity<Student> getStud5ByName(@PathVariable String name) {
        var std = studentRepository.findByName(name);
        if (std.isPresent()) {
            return new ResponseEntity<>(std.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity <>(null, HttpStatus.NOT_FOUND);
        }
    }
}

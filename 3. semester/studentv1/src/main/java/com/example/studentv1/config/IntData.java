package com.example.studentv1.config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.studentv1.model.Student;
import com.example.studentv1.model.Teacher;
import com.example.studentv1.repositories.StudentRepository;
import com.example.studentv1.repositories.TeacherRepository;

    @Component
public class IntData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Viggo");
        s1.setBornDate(LocalDate.now());
        s1.setBornTime(LocalTime.now());
        studentRepository.save(s1);
        System.out.println("saved");
        List<Student> lst = studentRepository.findAll();
        System.out.println("Antal studerende i database=" + lst.size());
        s1.setId(2);
        studentRepository.save(s1);
        System.out.println("saved");
        lst = studentRepository.findAll();
        System.out.println("Antal studerende i database=" + lst.size());

        // Teacher

        Teacher t1 = new Teacher();
        t1.setId(1);
        t1.setName("Malik");
        t1.setBornDate(LocalDate.now());
        t1.setBornTime(LocalTime.now());
        teacherRepository.save(t1);
        System.out.println("Teacher saved");
        List<Teacher> thlist = teacherRepository.findAll();
        System.out.println("Tecaher list: " + thlist.size());
        t1.setId(2);
        teacherRepository.save(t1);
        System.out.println("saved");
        thlist = teacherRepository.findAll();
        System.out.println("Antal Teacher i database=" + thlist.size());



    }
}
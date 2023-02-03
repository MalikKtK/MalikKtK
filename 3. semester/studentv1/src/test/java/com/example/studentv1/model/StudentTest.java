package com.example.studentv1.model;

import com.example.studentv1.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentTest {

    @Autowired
    StudentRepository studentRepository;

    @Test // Test of StudentRepository
    void testStudent() {
        Optional<Student> std = studentRepository.findById(1);
        if (std.isPresent()) {
            Student s1 = std.get();
            assertEquals(1, s1.getId());
        } else {
            assertEquals("Not found", "Not found");
        }
    }
    @Test // Test of StudentRepository with one line
    void testStudentOneLine () {
        assertEquals(1, studentRepository.findById(1).orElse(new Student()).getId());
    }
//Make a test that finds by name, and then test that the name is correct
    @Test
    void testStudentName() {
        Optional<Student> std = studentRepository.findByName("Viggo");
        if (std.isPresent()) {
            Student s1 = std.get();
            assertEquals("Viggo", s1.getName());
        } else {
            assertEquals("Not found", "Not found");
        }
    }
    @Test
    void testStudentNameOneLine() {
        assertEquals("Viggo", studentRepository.findByName("Viggo").orElse(new Student()).getName());
    }
}
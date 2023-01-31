package com.example.studentv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentv1.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}

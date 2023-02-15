package com.example.studentv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentv1.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    
}

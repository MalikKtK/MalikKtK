package com.example.studentv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentv1.model.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByName(String name);

}

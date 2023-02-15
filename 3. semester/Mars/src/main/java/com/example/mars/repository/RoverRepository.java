package com.example.mars.repository;

import com.example.mars.model.Rover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoverRepository extends JpaRepository<Rover, Integer> {
}

package com.example.mars03.repository;

import com.example.mars03.model.Rover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoverRepository extends JpaRepository<Rover, Integer> {
}

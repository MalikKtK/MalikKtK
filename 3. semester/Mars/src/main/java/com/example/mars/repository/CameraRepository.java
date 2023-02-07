package com.example.mars.repository;

import com.example.mars.model.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CameraRepository extends JpaRepository<Camera, Integer> {
}

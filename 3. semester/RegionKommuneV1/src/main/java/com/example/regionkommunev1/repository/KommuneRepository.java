package com.example.regionkommunev1.repository;

import com.example.regionkommunev1.model.Kommune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KommuneRepository extends JpaRepository<Kommune, String> {
}

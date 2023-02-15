package com.example.useremployeev1.repository;

import com.example.useremployeev1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

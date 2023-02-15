package com.example.useremployeev1.model;

import com.example.useremployeev1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testmalik() {
        assertEquals(true, employeeRepository.findByName("malik").isPresent());
    }

    @Test
    void testvalidemail() {
        var obj = employeeRepository.findByName("malik").orElse(null);
        assertEquals(true, employeeRepository.findByName("malik").orElse(new Employee()).isValidEmail());
    }


}
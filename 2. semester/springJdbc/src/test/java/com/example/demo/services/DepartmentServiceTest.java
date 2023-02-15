package com.example.demo.services;

import com.example.demo.models.Department;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.repositories.IRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {

    @Test
    void findLongestNameOfDepartments() {
        //Arrange
        IRepository<Department> testRepository = new DepartmentRepository();
        DepartmentService deptService = new DepartmentService(testRepository);
        //Act
        //Assert
    }
}
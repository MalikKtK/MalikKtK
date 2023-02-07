package com.example.useremployeev1.config;

import com.example.useremployeev1.model.Employee;
import com.example.useremployeev1.model.User;
import com.example.useremployeev1.repository.EmployeeRepository;
import com.example.useremployeev1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        if (13 > 4) {
            User user = new User();
            user.setEmail("kutuk-malik2635@live.dk");
            user.setPassword("nwr92auv");
            userRepository.save(user);

            Employee employee = new Employee();
            employee.setName("Malik");
            employee.setBorn(LocalDateTime.of(1999, 12, 26, 17, 30));
            employee.setUser(user);
            employeeRepository.save(employee);
        }
    }
}

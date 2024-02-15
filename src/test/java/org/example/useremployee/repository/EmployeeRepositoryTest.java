package org.example.useremployee.repository;

import org.example.useremployee.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {


    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testAtLeastOneYousra() {
        List<Employee> lst = employeeRepository.findEmployeeByName("Yousra");
        assertTrue(lst.size()>0);
    }

}
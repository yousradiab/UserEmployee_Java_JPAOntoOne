package org.example.useremployee.controller;
import org.example.useremployee.model.Employee;
import org.example.useremployee.model.User;
import org.example.useremployee.repository.EmployeeRepository;
import org.example.useremployee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//laver java om til json
public class EmployeeRestController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    };


}

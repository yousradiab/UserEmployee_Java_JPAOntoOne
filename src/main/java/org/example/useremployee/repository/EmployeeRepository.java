package org.example.useremployee.repository;

import org.example.useremployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //metode
    List<Employee> findEmployeeByName(String name);


}

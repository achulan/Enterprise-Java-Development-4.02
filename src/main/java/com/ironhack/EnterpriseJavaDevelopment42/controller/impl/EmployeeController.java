package com.ironhack.EnterpriseJavaDevelopment42.controller.impl;

import com.ironhack.EnterpriseJavaDevelopment42.enums.Status;
import com.ironhack.EnterpriseJavaDevelopment42.model.Employee;
import com.ironhack.EnterpriseJavaDevelopment42.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/all-doctors")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/doctor-by-id/{id}")
    public Employee findByEmployeeId(@PathVariable(name="id")Integer id) {
        return employeeRepository.findByEmployeeId(id);
    }

    @GetMapping("/doctors-by-status/{status}")
    public List<Employee> findByStatus(@PathVariable(name="status") Status status) {
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/doctors-by-department/{department}")
    public List<Employee> findByDepartment(@PathVariable(name="department") String department) {
        return employeeRepository.findByDepartment(department);
    }

}

package com.ironhack.EnterpriseJavaDevelopment42.controller.interfaces;

import com.ironhack.EnterpriseJavaDevelopment42.enums.Status;
import com.ironhack.EnterpriseJavaDevelopment42.model.Employee;

import java.util.List;

public interface InterfaceEmployeeController {

    public Employee findByEmployeeId(Integer employeeId);
    public List<Employee> findByStatus(Status status);
    public List<Employee> findByDepartment(String department);
}

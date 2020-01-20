package com.ignarus.springweb.services;

import java.util.List;

import com.ignarus.springweb.models.Employee;

public interface IEmployeeService {

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long employeeId);
    void deleteEmployee(Long employeeId);

}
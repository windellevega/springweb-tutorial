package com.ignarus.springweb.services;

import java.util.List;

import com.ignarus.springweb.dao.IEmployeeDAO;
import com.ignarus.springweb.models.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDao;

    @Override
    public Employee saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.saveAndFlush(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        // TODO Auto-generated method stub
        return employeeDao.findById(employeeId).get();
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        // TODO Auto-generated method stub
        employeeDao.deleteById(employeeId);
    }

}
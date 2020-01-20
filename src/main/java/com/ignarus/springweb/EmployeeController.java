package com.ignarus.springweb;

import java.util.List;

import com.ignarus.springweb.models.Employee;
import com.ignarus.springweb.services.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("employee")
@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) 
    {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping
    public Employee update(@RequestBody Employee employee)
    {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() 
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId)
    {
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("{employeeId}")
    public void delete(@PathVariable(name = "employeeId") Long employeeId)
    {
        employeeService.deleteEmployee(employeeId);
    }
}
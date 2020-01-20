package com.ignarus.springweb.dao;

import com.ignarus.springweb.models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Long> {
    
}
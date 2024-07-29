package com.restmicroservice.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restmicroservice.employee.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

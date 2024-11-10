package com.restmicroservice.employee.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.restmicroservice.employee.entities.Employee;
import com.restmicroservice.employee.response.EmployeeResponse;
import com.restmicroservice.employee.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") Integer id) {
        EmployeeResponse employee = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

	@GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee/v1/save")
    public ResponseEntity<EmployeeResponse> persistEmployee(@Valid  @RequestBody Employee emp){
        EmployeeResponse employee = employeeService.persistEmployee(emp);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}

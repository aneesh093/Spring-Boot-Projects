package com.restmicroservice.employee.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	private Integer empId;
	private String empName;
	private BigDecimal salary;
	private Integer priority;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Column(name="name")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Column(name="salary")
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Employee(Integer empId, String empName, BigDecimal salary,Integer priority) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.priority=priority;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	@Column(name="priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}

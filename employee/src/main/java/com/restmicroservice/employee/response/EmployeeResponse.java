package com.restmicroservice.employee.response;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeResponse {

	private Integer empId;
	private String empName;
	private BigDecimal salary;
	
	private List<AddressResponse> addressResponse;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public List<AddressResponse> getAddressResponse() {
		return addressResponse;
	}
	public void setAddressResponse(List<AddressResponse> addressResponse) {
		this.addressResponse = addressResponse;
	}
	
	
}

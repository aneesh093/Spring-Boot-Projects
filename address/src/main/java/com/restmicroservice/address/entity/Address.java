package com.restmicroservice.address.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable {

	public Address() {
		super();
	}
	private Integer addressId;
	private String address1;
	private String city;
	private Integer empId;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="addressid")
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	@Column(name="address1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@Column(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="eid")
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Address(Integer addressId, String address1, String city, Integer empId) {
		super();
		this.addressId = addressId;
		this.address1 = address1;
		this.city = city;
		this.empId = empId;
	}
	
	
	
}

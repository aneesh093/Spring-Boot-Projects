package com.restmicroservice.address.response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AddressResponse {
	
	private Integer addressId;
	private String address1;
	private String city;
	private Integer empId;
	
}

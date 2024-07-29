package com.restmicroservice.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.restmicroservice.address.response.AddressResponse;
import com.restmicroservice.address.service.AddressService;

@Controller
public class AddressController {
	@Autowired
    private AddressService addressService;
 
    @GetMapping("/address/{employeeId}")
    public ResponseEntity<List<AddressResponse>> getAddressByEmployeeId(@PathVariable("employeeId") int employeeId) {
    	List<AddressResponse> addressResponse = addressService.findAddressByEmployeeId(employeeId);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}

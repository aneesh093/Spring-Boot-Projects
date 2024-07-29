package com.restmicroservice.address.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restmicroservice.address.entity.Address;
import com.restmicroservice.address.repositories.AddressRepo;
import com.restmicroservice.address.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
    private AddressRepo addressRepo;
 
    @Autowired
    private ModelMapper mapper;
 
    public List<AddressResponse> findAddressByEmployeeId(int employeeId) {
       List<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
       List<AddressResponse> addList=new ArrayList<>();      
       for(Address ad: addressByEmployeeId) {
    	   AddressResponse addressResponse = mapper.map(ad, AddressResponse.class);
    	   addList.add(addressResponse);
       }
       return addList;
    }

}

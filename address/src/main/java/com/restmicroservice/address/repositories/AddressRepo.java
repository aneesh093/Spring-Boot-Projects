package com.restmicroservice.address.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.restmicroservice.address.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

	 @Query("SELECT ea FROM Address ea where ea.empId=:employeeId")
	 List<Address> findAddressByEmployeeId(@Param("employeeId") int employeeId);
}

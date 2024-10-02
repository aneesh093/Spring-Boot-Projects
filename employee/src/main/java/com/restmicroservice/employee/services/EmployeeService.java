package com.restmicroservice.employee.services;

import java.util.List;
import java.util.Optional;

import org.kie.api.runtime.KieSession;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restmicroservice.employee.entities.Employee;
import com.restmicroservice.employee.exceptions.NoRecordFoundException;
import com.restmicroservice.employee.repository.EmployeeRepo;
import com.restmicroservice.employee.response.AddressResponse;
import com.restmicroservice.employee.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;
	
	@Autowired
    private ModelMapper mapper;
	
	@Autowired
    private RestTemplate restTemplate;

    @Autowired
    private KieSession session;

    public EmployeeResponse getEmployeeById(Integer id) {
        Optional<Employee> employee = empRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        
        List<AddressResponse> addResp=restTemplate.getForObject("http://localhost:8081/address-service/address/{id}", List.class, id);
        employeeResponse.setAddressResponse(addResp);
        return employeeResponse;
    }

    public Employee getEmployee(int id) {
        return empRepo.findById(id).orElseThrow( () -> new NoRecordFoundException("Records Not Found"));

    }

    public EmployeeResponse persistEmployee(Employee emp) {

        session.insert(emp);
        session.fireAllRules();
        empRepo.save(emp);
        return  mapper.map(emp, EmployeeResponse.class);

    }
}

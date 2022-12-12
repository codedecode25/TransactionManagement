package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.repo.AddressRepo;
import com.example.demo.repo.EmployeeRepo;

@Service

public class EmployeeService {
	
	@Autowired
	private EmployeeRepo crudRepo;
	
	@Autowired
	private AddressService addressService;
	
	@Transactional
	public Employee addEmployee(Employee employee) throws Exception  {
		
		Employee savedEmployee = crudRepo.save(employee);
		
		Address address = new Address();
		address.setId(1L);
		address.setName("Banglore Whitefield");
		//address.setEmp(employee);
		addressService.addAdressToo(address);
		
		return savedEmployee;
	}


	


}

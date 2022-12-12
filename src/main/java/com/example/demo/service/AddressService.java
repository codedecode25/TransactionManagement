package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Address;
import com.example.demo.repo.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void addAdressToo(Address address) {
		addressRepo.save(address);
		
	}

}

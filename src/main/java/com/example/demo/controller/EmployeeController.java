package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/code")
public class EmployeeController {
		@Autowired
		private EmployeeService employeeService;

		@PostMapping("/save")
		public ResponseEntity<?> addEmployee(@RequestBody Employee employee) throws Exception{
				Employee employeeSaved = employeeService.addEmployee(employee);
				return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
			}
}

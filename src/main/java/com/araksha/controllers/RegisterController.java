package com.araksha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.araksha.entity.Employee;
import com.araksha.service.EmployeeService;

@RestController
public class RegisterController {

	@Autowired
	EmployeeService employeeService;
	
	@PutMapping( value="/register/add")
	public Employee register(@RequestBody Employee employee) {
		return employeeService.addUser(employee);
	}
}

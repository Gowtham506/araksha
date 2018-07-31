package com.araksha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.araksha.entity.Employee;
import com.araksha.repository.EmployeeRepository;
import com.araksha.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	public Employee addUser(Employee employee) {
		return employeeRepository.save(employee);
	}

}

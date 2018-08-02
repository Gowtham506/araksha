package com.araksha.araksha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.araksha.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackages= {"com.araksha.service","com.araksha.controllers"})
@EnableMongoRepositories(basePackages= {"com.araksha.repository"})
public class ArakshaApplication {
	
	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(ArakshaApplication.class, args);
	}
  
}

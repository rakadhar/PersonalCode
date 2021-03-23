package com.dev.rd.springboot.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.rd.springboot.Employee.model.Employee;
import com.dev.rd.springboot.Employee.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
 @Autowired 	
 private EmployeeRepo employeeRepo;
 
 @GetMapping("/employee")
  public List<Employee> getAllEmployee(){
	  return employeeRepo.findAll();
  }
}

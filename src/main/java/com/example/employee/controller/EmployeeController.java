package com.example.employee.controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepo;
@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/editemployee/{id}")
	public Employee editEmployee(@RequestBody Employee employee,@PathVariable long id) {
		return repo.save(employee);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable long id) {
		repo.deleteById(id);
	}
}

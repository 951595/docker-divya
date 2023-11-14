package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) throws Exception{
		return service.saveEmployee(employee);
	}
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee>ep){
		return service.saveEmployees(ep);
	}
	
	@GetMapping("/employee")
	public List<Employee> FindAllEmployees(){
		return service.getEmployees();
	}
	@GetMapping("/employee/{id}")
	public Employee FindEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	

}

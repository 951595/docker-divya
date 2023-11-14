package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee ep) throws Exception{
		Employee employee=repository.findById(ep.getId()).orElse(null);
		if(employee == null) {
		return repository.save(ep);
		}
		else {
			throw new Exception("Employee id already in database...");
		}
		
	}
	public List<Employee> saveEmployees(List<Employee>employees){
		return repository.saveAll(employees);
		
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

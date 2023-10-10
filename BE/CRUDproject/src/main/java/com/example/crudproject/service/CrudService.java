package com.example.crudproject.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crudproject.entity.Employee;

@Service
public interface CrudService {

	public  Iterable< Employee> retriveEmployee();
	public void createEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Optional<Employee>  searchEmployee(String empName);
	
}

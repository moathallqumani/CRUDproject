package com.example.crudproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudproject.DAO.employeeDAO;
import com.example.crudproject.entity.Employee;
import com.example.crudproject.service.CrudService;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path="/crud")
@Slf4j
@CrossOrigin
public class controller {


	
	@Autowired
	private CrudService crudService;
	
			
	@GetMapping(path = "/retriveemployees")
	public Iterable< Employee> getEmployees() {
	
		return crudService.retriveEmployee();
	}
	
	@PostMapping(path="/create")
	public  String createNewEmployee(@RequestBody Employee employee) {
		
		crudService.createEmployee(employee);
		
		return "Employee Created.";
	}
	
	@PostMapping(path="/update")
	public  String updateEmployee(@RequestBody Employee employee) {

		crudService.updateEmployee( employee);
		return "Employee Updated.";
	}
	
	@PostMapping(path="/delete")
	public  String deleteEmployee(@RequestBody Employee employee) {

		crudService.deleteEmployee( employee);
		return "Employee Deleted.";
	}
	
	@GetMapping(path="/search")
	public  ResponseEntity<Optional<Employee>> updateEmployee(@RequestParam String empName) {

	
		return  ResponseEntity.ok(crudService.searchEmployee( empName.toLowerCase()));
	}
}

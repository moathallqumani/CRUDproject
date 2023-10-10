package com.exmple.crudproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudproject.DAO.employeeDAO;
import com.example.crudproject.entity.Employee;

@RestController
public class controller {

	@Autowired
	private employeeDAO dao ;
	@GetMapping(path = "/retriveemployees")
	public Iterable< Employee> getEmployees() {
	
		return dao.findAll();
	}
	
	@PostMapping(path="/createEmpolyee")
	public  String createNewEmployee() {
		
		return "Employee Created.";
	}
}

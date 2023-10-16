package com.example.crudproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.example.crudproject.response.BaseResponse;
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
	public BaseResponse getEmployees() {
		
		BaseResponse res = new BaseResponse();
		res.setMessage("SUCCESS");
		res.setResponseCode("10");
		res.setEntitiesResponse(crudService.retriveEmployee());
		return res;
		
	}
	
	@PostMapping(path="/create")
	public  BaseResponse createNewEmployee(@RequestBody Employee employee) {
		
		crudService.createEmployee(employee);
		BaseResponse res = new BaseResponse();
		res.setMessage("SUCCESS");
		res.setResponseCode("10");
		return res;
	}
	
	@PostMapping(path="/update")
	public  BaseResponse updateEmployee(@RequestBody Employee employee) {

		crudService.updateEmployee( employee);
		
		BaseResponse res = new BaseResponse();
		res.setMessage("SUCCESS");
		res.setResponseCode("10");
		return res;
	
	}
	
	@PostMapping(path="/delete")
	public  BaseResponse deleteEmployee(@RequestBody Employee employee) {

		crudService.deleteEmployee( employee);
		BaseResponse res = new BaseResponse();
		res.setMessage("SUCCESS");
		res.setResponseCode("10");
		return res;
	}
	
	@GetMapping(path="/search")
	public  BaseResponse updateEmployee(@RequestParam String empName) {
		BaseResponse res = new BaseResponse();
		res.setEntitiesResponse(crudService.searchEmployee( empName.toLowerCase()));
		res.setMessage("SUCCESS");
		res.setResponseCode("10");
		return  res;
	}
}

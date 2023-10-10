package com.example.crudproject.DAO;

import org.springframework.stereotype.Repository;

import com.example.crudproject.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface employeeDAO  extends JpaRepository<Employee,String>{
	
}

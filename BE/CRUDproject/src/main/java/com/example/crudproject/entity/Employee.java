package com.example.crudproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

import org.springframework.data.relational.core.mapping.Table;
@Data
@Entity
@Table(value = "employee")
@NoArgsConstructor
public class Employee {

	private String employeeName;
	private String employeeSalary;
	private String employeeAge;
	private String employeeRole;
}

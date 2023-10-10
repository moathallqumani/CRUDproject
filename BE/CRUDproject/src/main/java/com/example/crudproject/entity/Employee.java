package com.example.crudproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Embedded.Nullable;;

@Data
@Table(name = "employee")
@NoArgsConstructor
@Entity
public class Employee {


	@Nullable
	@Column
	private String employee_Id;
	
	@Id
	@Column
	private String employee_Name;
	@Column
	private String employee_Salary;
	@Column
	private String employee_Age;
	@Column
	private String employee_Role;
}

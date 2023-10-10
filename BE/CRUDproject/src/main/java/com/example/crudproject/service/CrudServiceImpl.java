package com.example.crudproject.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudproject.DAO.employeeDAO;
import com.example.crudproject.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class CrudServiceImpl  implements CrudService{

	
	@Autowired
	private employeeDAO dao ;
	
	@Override
	public  Iterable< Employee> retriveEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void createEmployee(Employee employee) {
		
		Employee emp = new Employee();
		emp.setEmployee_Id(String.valueOf(dao.findAll().size()+1));
		emp.setEmployee_Name(employee.getEmployee_Name());
		emp.setEmployee_Salary(employee.getEmployee_Salary());
		emp.setEmployee_Age(employee.getEmployee_Age());
		emp.setEmployee_Role(employee.getEmployee_Role());
		dao.save(emp);
		log.info("Employee: "+emp + "Created");
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		Optional<Employee> emp = dao.findById(employee.getEmployee_Name());
		
		emp.get().setEmployee_Name(employee.getEmployee_Name());
		emp.get().setEmployee_Salary(employee.getEmployee_Salary());
		emp.get().setEmployee_Age(employee.getEmployee_Age());
		emp.get().setEmployee_Role(employee.getEmployee_Role());
		dao.save(emp.get());
		log.info("Employee: "+emp + "Updated");
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		dao.delete(employee);
		log.info("Employee: "+employee + "Deleted");
		
	}

	@Override
	public Optional<Employee> searchEmployee(String empName) {
		
		return dao.findById(empName);
	}
	

}

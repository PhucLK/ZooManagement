package com.fsoft.service;

import java.util.List;

import com.fsoft.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	//Employee getEmployee(int id);
	
	Employee saveEmployee(Employee employee);
	
	//boolean deleteEmpoyee(int id);

	Employee getEmployee(String id);

	boolean deleteEmpoyee(String id);
}

package com.fsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.model.Employee;
import com.fsoft.repository.EmployeeRepository;
import com.fsoft.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public boolean deleteEmpoyee(String id) {
		// TODO Auto-generated method stub
		employeeRepository.delete(id);
		return employeeRepository.exists(id);
	}

}

package com.fsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

}

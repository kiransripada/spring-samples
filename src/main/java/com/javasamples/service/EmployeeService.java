package com.javasamples.service;

import java.util.List;

import com.javasamples.domain.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public void addNewEmployee(Employee employee);

}

package com.javasamples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javasamples.domain.Employee;

@Component
public class EmployeeServiceMockImpl implements EmployeeService{
	private List<Employee> testEmployees = new ArrayList<Employee>();

	// populate the Employee List
		public EmployeeServiceMockImpl() {
			testEmployees.add(new Employee("1", "emp1", "M1", 10000));
			testEmployees.add(new Employee("2", "emp2", "M2", 20000));
			testEmployees.add(new Employee("3", "emp3", "M3", 30000));
			testEmployees.add(new Employee("4", "emp4", "M4", 40000));
			testEmployees.add(new Employee("5", "emp5", "M5", 50000));
			testEmployees.add(new Employee("6", "emp6", "M6", 60000));
		}
	

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return new ArrayList<Employee>(testEmployees);
	}


	public void addNewEmployee(Employee employee) {
		testEmployees.add(employee);
		
	}

}

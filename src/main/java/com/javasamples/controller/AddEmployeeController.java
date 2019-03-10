package com.javasamples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javasamples.domain.Employee;
import com.javasamples.service.EmployeeService;

@Controller
public class AddEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/addNewEmployee")
	public ModelAndView addEmployee(@RequestParam("empId") String empId,
			@RequestParam("name") String name,
			@RequestParam("designation") String designation,
			@RequestParam("salary") String salary) {
		double salaryDouble = new Double(salary);
		Employee employee = new Employee(empId, name, designation, salaryDouble);
		employeeService.addNewEmployee(employee);
		return new ModelAndView("/employee-added.jsp", "name", name);
	}


}

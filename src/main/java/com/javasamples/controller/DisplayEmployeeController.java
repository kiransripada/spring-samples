package com.javasamples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javasamples.domain.Employee;
import com.javasamples.service.EmployeeService;

@Controller
public class DisplayEmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/viewAllEmployees")
	public ModelAndView viewAllItems() {
		System.out.println("***KIRAN DisplayEmployeeController");
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return new ModelAndView("/displayAllEmployees.jsp", "allEmployees",
				allEmployees);
	}

}

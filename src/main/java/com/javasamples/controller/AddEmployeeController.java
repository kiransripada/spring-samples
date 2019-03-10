package com.javasamples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javasamples.domain.Employee;
import com.javasamples.service.EmployeeService;

@Controller
public class AddEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

/*	@RequestMapping("/addNewEmployee")
	public ModelAndView addEmployee(@RequestParam("empId") String empId,
			@RequestParam("name") String name,
			@RequestParam("designation") String designation,
			@RequestParam("salary") String salary) {
		double salaryDouble = new Double(salary);
		Employee employee = new Employee(empId, name, designation, salaryDouble);
		employeeService.addNewEmployee(employee);
		return new ModelAndView("/employee-added.jsp", "name", name);
	}*/
	
	@RequestMapping(value = "/addNewEmployee", method = RequestMethod.GET)
	public ModelAndView show() {
		System.out.println("KIRAN -- show()");
		return new ModelAndView("/addEmployee.jsp", "emp", new Employee());
	}
	
	@RequestMapping(value = "/addNewEmployee", method = RequestMethod.POST)
	public ModelAndView processRequest(Employee emp, Errors result) {
		System.out.println("KIRAN -- processRequest()");

		if (result.hasErrors()) {
			return new ModelAndView("/addEmployee.jsp", "emp", emp);
		}
		employeeService.addNewEmployee(emp);
		return new ModelAndView("/employee-added.jsp", "name", emp.getName());
	}




}

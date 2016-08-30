package com.interfac.springdemo.employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.interfac.springdemo.employee.model.Employee;
import com.interfac.springdemo.employee.services.IEmployeeServices;

@Controller
public class EmployeeController {
	
	
	private IEmployeeServices employeeServices;
	
	public IEmployeeServices getEmployeeServices() {
		return employeeServices;
	}

	public void setEmployeeServices(IEmployeeServices employeeServices) {
		this.employeeServices = employeeServices;
	}

	@RequestMapping(value = "/employee/add")
	public void addEmployee() {
		
	}
	
	@Transactional
	@RequestMapping(value = "/employees", method=RequestMethod.GET)
	public String listEmployees(Model model){
		model.addAttribute("employee", new Employee());
		model.addAttribute("employeesList", getEmployeeServices().listEmployees());
		
		return "employees";
	}
}

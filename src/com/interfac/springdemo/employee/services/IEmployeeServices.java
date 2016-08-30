package com.interfac.springdemo.employee.services;

import java.util.List;

import com.interfac.springdemo.employee.model.Employee;

public interface IEmployeeServices {
	
	void addEmployee(Employee emp);
	
	Employee getEmployeeById(int empId);
	
	public void deleteEmployee(Employee emp);
	
	public void editEmployee();
	
	public List<Employee> listEmployees();
	
}

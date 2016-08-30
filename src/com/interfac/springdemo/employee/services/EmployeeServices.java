package com.interfac.springdemo.employee.services;

import java.util.List;

import com.interfac.springdemo.employee.dataaccess.IEmployeeDAO;
import com.interfac.springdemo.employee.model.Employee;

public class EmployeeServices implements IEmployeeServices{
	
	private IEmployeeDAO employeeDao;
	
	public IEmployeeDAO getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(IEmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	
	@Override
	public void addEmployee(Employee emp) {
		getEmployeeDao().addEmployee(emp);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return getEmployeeDao().getEmployeeById(empId);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		getEmployeeDao().deleteEmployee(emp);
	}

	@Override
	public void editEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> listEmployees() {
		return getEmployeeDao().listEmployees();
	}

}

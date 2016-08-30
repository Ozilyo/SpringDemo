package com.interfac.springdemo.employee.dataaccess;

import java.sql.SQLException;
import java.util.List;

import com.interfac.springdemo.department.model.Department;
import com.interfac.springdemo.employee.model.Employee;

public interface IEmployeeDAO {

	
	/**
	 * Adds an employee object to the database
	 * @param employee
	 * @return
	 * @throws SQLException
	 */
	public boolean addEmployee(Employee employee);
	
	/**
	 * Updates an employees information
	 * @param empNo
	 * @param field
	 * @param value
	 * @return
	 * @throws SQLException
	 */
	public void editEmployee(Employee emp, int field, Object value);
	
	/**
	 * Retrieves the whole list of employees from the database 
	 * @return
	 * @throws SQLException
	 */
	public List<Employee> listEmployees();
	
	/**
	 * Retrieves an employee object given the employee number
	 * @param empNo
	 * @return
	 * @throws SQLException
	 */
	public Employee getEmployeeById(int empId);


	public void deleteEmployee (Employee employee);
	
	public void addEmployeeToDepartment(Employee emp, Department dept);
}

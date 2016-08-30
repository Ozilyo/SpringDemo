package com.interfac.springdemo.department.dataaccess;

import java.util.List;
import java.util.Set;

import com.interfac.springdemo.department.model.Department;
import com.interfac.springdemo.employee.model.Employee;

/**
 * @author Ali
 *
 */
public interface IDepartmentDAO {
	
	/**
	 * @param dept
	 */
	public void addDepartment(Department dept);
	
	/**
	 * @param deptId
	 * @return
	 */
	public Department getDepartmentById(int deptId);
	
	/**
	 * this method is deprecated
	 * @param deptName
	 * @return
	 */
	//public Department getDepartmentByName(String deptName);
	
	/**
	 * @param dept
	 */
	public void deleteDepartment(Department dept);
	
	/**
	 * @param dept
	 * @param deptName
	 */
	public void editDepartment(Department dept, String deptName);
	
	/**
	 * @param dept
	 * @return
	 */
	public Set<Employee> displayEmployeesInDepartment(Department dept);

	/**
	 * @return
	 */
	public List<Department> listDepartments();

}


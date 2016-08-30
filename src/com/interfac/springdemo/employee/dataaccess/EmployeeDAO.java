package com.interfac.springdemo.employee.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.interfac.springdemo.department.model.Department;
import com.interfac.springdemo.employee.model.Employee;

public class EmployeeDAO implements IEmployeeDAO {
	
	private HibernateTemplate hibernateTemplate; 
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	@Override
	public boolean addEmployee(Employee employee) {
		getHibernateTemplate().save(employee);
		return false;
	}

	@Transactional
	@Override
	public void editEmployee(Employee emp, int field, Object value) {
		// TODO:
	}

//	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Employee> listEmployees() {
//		List<Employee> employees = new ArrayList<Employee>();
//		for (int i = 1; i < 4; i++) {
//			employees.add((Employee)getHibernateTemplate().load(Employee.class, i));
//		}
//		return employees;
//		try {
			return (List<Employee>)getHibernateTemplate().find("from Employee");
//		} catch (Exception e) {
//			System.out.println("WTF MAN");
//		}
//		return null;
	}

	@Transactional
	@Override
	public Employee getEmployeeById(int empId) {
		return (Employee)getHibernateTemplate().load(Employee.class, empId);
	}

	@Transactional
	@Override
	public void deleteEmployee(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	@Transactional
	@Override
	public void addEmployeeToDepartment(Employee emp, Department dept) {
		// TODO Auto-generated method stub
		
	}

}

package com.interfac.springdemo.department.dataaccess;

import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.interfac.springdemo.department.model.Department;
import com.interfac.springdemo.employee.model.Employee;

public class DepartmentDAO implements IDepartmentDAO {
	
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Override
	public void addDepartment(Department dept) {
		getHibernateTemplate().save(dept);
	}

	@Override
	public Department getDepartmentById(int deptId) {
		return getHibernateTemplate().load(Department.class, deptId);
	}	

	@Override
	public void deleteDepartment(Department dept) {
		getHibernateTemplate().delete(dept);
	}

	@Override
	public void editDepartment(Department dept, String deptName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Employee> displayEmployeesInDepartment(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> listDepartments() {
		return getHibernateTemplate().loadAll(Department.class);
	}



}

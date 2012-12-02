package com.imu.coursenet.service.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Admin;
import com.imu.coursenet.domain.Department;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class DepartmentDaoImpl 
	extends YeekuHibernateDaoSupport 
	implements DepartmentDao
{

	@Override
	public Department get(Integer departmentId) {
		return getHibernateTemplate()
				.get(Department.class , departmentId);
	}

	@Override
	public Integer save(Department department) {
		return (Integer)getHibernateTemplate()
				.save(department);
	}

	@Override
	public void update(Department department) {
		getHibernateTemplate()
		.update(department);
		
	}

	@Override
	public void delete(Department department) {
		getHibernateTemplate()
		.delete(department);
		
	}

	@Override
	public void delete(Integer departmentId) {
		getHibernateTemplate()
		.delete(get(departmentId));
		
	}

	@Override
	public List<Department> findAll() {
		return (List<Department>)getHibernateTemplate()
				.find("from Department ");
	}

}

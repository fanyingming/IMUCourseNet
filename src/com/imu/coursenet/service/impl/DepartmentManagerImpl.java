package com.imu.coursenet.service.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class DepartmentManagerImpl implements DepartmentManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	private DepartmentDao departmentDao;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public List<Department> listAllDepartment() {
		return departmentDao.findAll();
	}

	@Override
	public int addDepartment(Department department) {
		// TODO Auto-generated method stub
	//	Department.setDepartment(department);
		departmentDao.save(department);
		return this.OP_SUCC;
		//return 0;
	}

	@Override
	public int deleteDepartment(int departmentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Department getDepartment(int departmentId) {
		return departmentDao.get(departmentId);
	}
	
	
}

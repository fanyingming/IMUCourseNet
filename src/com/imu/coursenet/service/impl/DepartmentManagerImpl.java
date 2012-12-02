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
	private SpecialtyDao specialtyDao;
	private CourseTypeDao courseTypeDao;
	private CourseDao courseDao;
	private Specialty specialty;
	
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}

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

	
	public void setSpecialtyDao(SpecialtyDao specialtyDao) {
		this.specialtyDao = specialtyDao;
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
		departmentDao.delete(departmentId);
		return this.OP_SUCC;
	}

	@Override
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentDao.update(department);
		return this.OP_SUCC;
	}

	@Override
	public Department getDepartment(int departmentId) {
		return departmentDao.get(departmentId);
	}
	
	
}

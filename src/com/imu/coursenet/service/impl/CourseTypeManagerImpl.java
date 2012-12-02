package com.imu.coursenet.service.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class CourseTypeManagerImpl implements CourseTypeManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	private DepartmentDao departmentDao;
	private SpecialtyDao specialtyDao;
	private CourseTypeDao courseTypeDao;
	private CourseDao courseDao;
	
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
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

	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}

	@Override
	public List<CourseType> listAllCourseType() {
		return courseTypeDao.findAll();
	}

	@Override
	public int addCourseType(CourseType courseType) {
		// TODO Auto-generated method stub
	//	Department.setDepartment(department);
		courseTypeDao.save(courseType);
		return this.OP_SUCC;
		//return 0;
	}

	@Override
	public int deleteCourseType(int courseTypeId) {
		courseTypeDao.delete(courseTypeId);
		return this.OP_SUCC;
	}

	@Override
	public int updateCourseType(CourseType courseType) {
		// TODO Auto-generated method stub
		courseTypeDao.update(courseType);
		return this.OP_SUCC;
	}

	@Override
	public CourseType getCourseType(int courseTypeId) {
		return courseTypeDao.get(courseTypeId);
	}
	
	
}

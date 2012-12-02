package com.imu.coursenet.service.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class CourseManagerImpl implements CourseManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	private DepartmentDao departmentDao;
	private SpecialtyDao specialtyDao;
	private CourseDao courseDao;
	private CourseTypeDao courseTypeDao;
	
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
	public List<Course> listAllCourse() {
		return courseDao.findAll();
	}

	@Override
	public int addCourse(Course course,int departmentId,int courseTypeId) {
		Department department=departmentDao.get(departmentId);
		CourseType courseType=courseTypeDao.get(courseTypeId);
		course.setCourseType(courseType);
		course.setDepartment(department);
		courseDao.save(course);
		return this.OP_SUCC;
		//return 0;
	}

	@Override
	public int deleteCourse(int courseId) {
		courseDao.delete(courseId);
		return this.OP_SUCC;
	}

	@Override
	public int updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.update(course);
		return this.OP_SUCC;
	}

	@Override
	public Course getCourse(int courseId) {
		return courseDao.get(courseId);
	}
	
	
}

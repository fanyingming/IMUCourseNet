package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class AddCourseAction extends ManagerBaseAction{
	private List<CourseType> courseTypes;
	private List<Department> departments;
	

	public List<CourseType> getCourseTypes() {
		return courseTypes;
	}


	public void setCourseTypes(List<CourseType> courseTypes) {
		this.courseTypes = courseTypes;
	}


	public List<Department> getDepartments() {
		return departments;
	}


	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


	@Override
	public String execute() throws Exception {
		courseTypes = courseTypeManager.listAllCourseType();
		departments = departmentManager.listAllDepartment();
		return SUCCESS;
	}
	
}

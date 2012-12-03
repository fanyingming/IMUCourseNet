package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateCourseAction extends ManagerBaseAction {
	private Course course;
	private int courseId;
	private int courseType_Id;
	private int department_Id;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	// Department getDepartment(int departmentId);
	public String execute() throws Exception {
		course = courseManager.getCourse(courseId);
		department_Id = course.getDepartment().getDepartmentId();
		departments = departmentManager.listAllDepartment();
		courseType_Id = course.getCourseType().getCourseTypeId();
		courseTypes = courseTypeManager.listAllCourseType();
		return SUCCESS;
	}

}

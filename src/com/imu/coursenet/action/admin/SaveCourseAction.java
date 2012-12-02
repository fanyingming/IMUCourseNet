package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class SaveCourseAction extends ManagerBaseAction{

	private String courseName;
	private Integer departmentId;
	private Integer courseTypeId;
	private String courseDescription;
	

	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	
	@Override
	public String execute() throws Exception {
		
		Course course=new Course(courseName,courseDescription);
		courseManager.addCourse(course,departmentId,courseTypeId);
		return SUCCESS;
		
	}


	
}

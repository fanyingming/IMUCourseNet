package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateCourseAction extends ManagerBaseAction{
	private Integer courseId;
	private String courseDescription;
	private String courseName;
	private Integer courseTypeId;
	private Integer departmentId;
	
	
	public Integer getCourseId() {
		return courseId;
	}


	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}


	public String getCourseDescription() {
		return courseDescription;
	}


	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Integer getCourseTypeId() {
		return courseTypeId;
	}


	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}


	public Integer getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}


	@Override
	public String execute() throws Exception {
		Course course = courseManager.getCourse(courseId);
		course.setCourseName(courseName);
		course.setCourseDescription(courseDescription);
		
		
		if(courseManager.updateCourse(course)==courseManager.OP_SUCC){
			return SUCCESS;
		}
		else 
			return ERROR;
	}
	
}

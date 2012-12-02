package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class SaveCourseTypeAction extends ManagerBaseAction{

	private String courseTypeName;
	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}

	public String getCourseTypeDescription() {
		return courseTypeDescription;
	}

	public void setCourseTypeDescription(String courseTypeDescription) {
		this.courseTypeDescription = courseTypeDescription;
	}

	private String courseTypeDescription;
	
	@Override
	public String execute() throws Exception {
		
		CourseType courseType=new CourseType(courseTypeName,courseTypeDescription);
		courseTypeManager.addCourseType(courseType);
		return SUCCESS;
	}


	
}

package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listCourseTypeAction extends ManagerBaseAction {
	private List<CourseType> courseTypes;

	public String execute() throws Exception {
		courseTypes = courseTypeManager.listAllCourseType();
		return SUCCESS;

	}

	public List<CourseType> getCourseTypes() {
		return courseTypes;
	}

	public void setCourseTypes(List<CourseType> courseTypes) {
		this.courseTypes = courseTypes;
	}
}

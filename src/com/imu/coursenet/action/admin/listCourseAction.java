package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listCourseAction extends ManagerBaseAction {
	private List<Course> courses;

	public String execute() throws Exception {
		courses = courseManager.listAllCourse();
		return SUCCESS;

	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}

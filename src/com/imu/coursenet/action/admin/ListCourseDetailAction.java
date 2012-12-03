package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class ListCourseDetailAction extends ManagerBaseAction{
	private List<CourseDetail> courseDetails;

	public List<CourseDetail> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(List<CourseDetail> courseDetails) {
		this.courseDetails = courseDetails;
	}

	@Override
	public String execute() throws Exception {
		courseDetails=courseDetailManager.listAllCourseDetail();
		return SUCCESS;
	}
	
	
}

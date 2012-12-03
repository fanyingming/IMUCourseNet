package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateCourseTypeAction extends ManagerBaseAction {
	private CourseType courseType;
	private int courseTypeId;

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public int getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	@Override
	// Department getDepartment(int departmentId);
	public String execute() throws Exception {
		courseType = courseTypeManager.getCourseType(courseTypeId);
		return SUCCESS;
	}

}

package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateCourseTypeAction extends ManagerBaseAction {
	private Integer courseTypeId;
	private String courseTypeDescription;
	private String courseTypeName;

	public Integer getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public String getCourseTypeDescription() {
		return courseTypeDescription;
	}

	public void setCourseTypeDescription(String courseTypeDescription) {
		this.courseTypeDescription = courseTypeDescription;
	}

	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}

	@Override
	public String execute() throws Exception {
		CourseType courseType = courseTypeManager.getCourseType(courseTypeId);
		courseType.setCourseTypeName(courseTypeName);
		courseType.setCourseTypeDescription(courseTypeDescription);

		if (courseTypeManager.updateCourseType(courseType) == courseTypeManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

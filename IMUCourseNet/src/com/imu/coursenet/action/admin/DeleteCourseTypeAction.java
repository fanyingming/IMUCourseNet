package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteCourseTypeAction extends ManagerBaseAction {
	private int courseTypeId;

	public int getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	@Override
	public String execute() throws Exception {
		int result = courseTypeManager.deleteCourseType(courseTypeId);
		if (result == courseTypeManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

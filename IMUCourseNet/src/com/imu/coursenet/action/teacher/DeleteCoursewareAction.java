package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteCoursewareAction extends ManagerBaseAction {
	private Integer coursewareId;

	public Integer getCoursewareId() {
		return coursewareId;
	}

	public void setCoursewareId(Integer coursewareId) {
		this.coursewareId = coursewareId;
	}

	@Override
	public String execute() throws Exception {
		if (coursewareManager.deleteCourseware(coursewareId) == coursewareManager.OP_SUCC) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}

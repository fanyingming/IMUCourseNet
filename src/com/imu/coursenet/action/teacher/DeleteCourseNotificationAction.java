package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteCourseNotificationAction extends ManagerBaseAction {
	private int courseNotificationId;

	public int getCourseNotificationId() {
		return courseNotificationId;
	}

	public void setCourseNotificationId(int courseNotificationId) {
		this.courseNotificationId = courseNotificationId;
	}

	@Override
	public String execute() throws Exception {
		int result = courseNotificationManager.deleteCourseNotification(courseNotificationId);
		if (result == courseNotificationManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

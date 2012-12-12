package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseNotification;

public class ShowCourseNotificationDetailAction extends ManagerBaseAction {
	private CourseNotification courseNotification;
	private Integer courseNotificationId;

	public Integer getCourseNotificationId() {
		return courseNotificationId;
	}

	public void setCourseNotificationId(Integer courseNotificationId) {
		this.courseNotificationId = courseNotificationId;
	}

	public CourseNotification getCourseNotification() {
		return courseNotification;
	}

	public void setCourseNotification(CourseNotification courseNotification) {
		this.courseNotification = courseNotification;
	}

	@Override
	public String execute() throws Exception {
		courseNotification = courseNotificationManager
				.getCourseNotification(courseNotificationId);
		return SUCCESS;
	}

}

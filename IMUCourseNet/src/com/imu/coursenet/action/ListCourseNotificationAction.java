package com.imu.coursenet.action;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class ListCourseNotificationAction extends ManagerBaseAction {
	private List<CourseNotification> courseNotifications;

	public List<CourseNotification> getCourseNotifications() {
		return courseNotifications;
	}

	public void setCourseNotifications(
			List<CourseNotification> courseNotifications) {
		this.courseNotifications = courseNotifications;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get(
				"courseDetailId");
		courseNotifications = courseNotificationManager
				.listCourseNotificationByCourseDetailId(courseDetailId);
		return SUCCESS;
	}

}

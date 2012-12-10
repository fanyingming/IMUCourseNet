package com.imu.coursenet.action.student;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class ShowStudentMainPageAction extends ManagerBaseAction {
	private List<CourseTaking> courseTakings;
	private List<CourseNotification> courseNotifications;

	public List<CourseTaking> getCourseTakings() {
		return courseTakings;
	}

	public void setCourseTakings(List<CourseTaking> courseTakings) {
		this.courseTakings = courseTakings;
	}

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
		User user = (User) ctx.getSession().get("user");
		courseTakings = courseTakingManager.listCourseTakingByStudentId(
				user.getUserId(), 0, 10);
		courseNotifications = courseNotificationManager
				.listCourseNotificationByStudentId(user.getUserId());
		return SUCCESS;
	}

}

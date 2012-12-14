package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseNotification;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

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
		ActionContext ctx = ActionContext.getContext();
		String level = (String) ctx.getSession().get("level");
		courseNotification = courseNotificationManager
				.getCourseNotification(courseNotificationId);
		//学生查看通知，需要增加浏览量。
		if(level.equals("student")){
			courseNotification.setCheckCounts(courseNotification.getCheckCounts()+1);
			courseNotificationManager.updateCourseNotification(courseNotification);
		}
		return SUCCESS;
	}

}

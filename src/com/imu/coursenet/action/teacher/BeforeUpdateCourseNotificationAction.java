package com.imu.coursenet.action.teacher;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class BeforeUpdateCourseNotificationAction extends ManagerBaseAction {
	private CourseNotification courseNotification;
	private int courseNotificationId;
	

	
	
	public int getCourseNotificationId() {
		return courseNotificationId;
	}




	public void setCourseNotificationId(int courseNotificationId) {
		this.courseNotificationId = courseNotificationId;
	}




	@Override
	
		public String execute() throws Exception {
		courseNotification = courseNotificationManager.getCourseNotification(courseNotificationId);
		
			return SUCCESS;
		}




	public CourseNotification getCourseNotification() {
		return courseNotification;
	}




	public void setCourseNotification(CourseNotification courseNotification) {
		this.courseNotification = courseNotification;
	}




	

}

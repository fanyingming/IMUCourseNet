package com.imu.coursenet.action.teacher;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class UpdateCourseNotificationAction extends ManagerBaseAction {
	private Integer courseNotificationId;
	private String title;
	private String content;
	
	public String getTitle() {
		return title;
	}

	public Integer getCourseNotificationId() {
		return courseNotificationId;
	}

	public void setCourseNotificationId(Integer courseNotificationId) {
		this.courseNotificationId = courseNotificationId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	@Override
	public String execute() throws Exception {
		System.out.println("***************courseNotificationId="+courseNotificationId);
		System.out.println("***************title="+title);
		if(courseNotificationId==null){
			return ERROR;
		}
		CourseNotification courseNotification = courseNotificationManager.getCourseNotification(courseNotificationId);
		
		courseNotification.setContent(content);
		courseNotification.setTitle(title);

		if (courseNotificationManager.updateCourseNotification(courseNotification) == courseNotificationManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}
	

}

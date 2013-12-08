package com.imu.coursenet.action.teacher;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class AddCourseNotificationAction extends ManagerBaseAction {

	private String title;
	private String content;
	private Integer checkCounts;
	private Integer courseDetailId;

	public String getTitle() {
		return title;
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

	public Integer getCheckCounts() {
		return checkCounts;
	}

	public void setCheckCounts(Integer checkCounts) {
		this.checkCounts = checkCounts;
	}

	public Integer getCourseDetailId() {
		return courseDetailId;
	}

	public void setCourseDetailId(Integer courseDetailId) {
		this.courseDetailId = courseDetailId;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get(
				"courseDetailId");
		courseNotificationManager.addCourseNotification(courseDetailId, title,
				content);
		return SUCCESS;

	}

}

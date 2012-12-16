package com.imu.coursenet.action.student;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;

public class GoToCourseMainPageAction extends ManagerBaseAction {
	private int courseDetailId;

	public int getCourseDetailId() {
		return courseDetailId;
	}

	public void setCourseDetailId(int courseDetailId) {
		this.courseDetailId = courseDetailId;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("courseDetailId", courseDetailId);
		return SUCCESS;
	}
}

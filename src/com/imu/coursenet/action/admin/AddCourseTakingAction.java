package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class AddCourseTakingAction extends ManagerBaseAction{
	private Integer userId;
	private Integer courseDetailId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCourseDetailId() {
		return courseDetailId;
	}
	public void setCourseDetailId(Integer courseDetailId) {
		this.courseDetailId = courseDetailId;
	}
	@Override
	public String execute() throws Exception {
		courseTakingManager.addCourseTaking( courseDetailId, userId);
		return SUCCESS;
	}
	
	
}

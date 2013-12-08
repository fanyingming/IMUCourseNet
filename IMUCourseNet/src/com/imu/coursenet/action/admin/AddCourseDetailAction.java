package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class AddCourseDetailAction extends ManagerBaseAction {
	private Integer teacherId;
	private Integer courseId;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Override
	public String execute() throws Exception {
		if (courseDetailManager.addCourseDetail(teacherId, courseId) == courseDetailManager.OP_SUCC) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

}

package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteCourseAction extends ManagerBaseAction{
	private int courseId;


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	@Override
	public String execute() throws Exception {
		int result=courseManager.deleteCourse(courseId);
		if(result == courseManager.OP_SUCC){
			return SUCCESS;
		}
		else
			return ERROR;
	}
	
}

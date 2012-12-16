package com.imu.coursenet.action.student;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class StudentWriteLetterAction extends ManagerBaseAction{
	private CourseDetail courseDetail;

	public CourseDetail getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get("courseDetailId");
		courseDetail=courseDetailManager.getCourseDetail(courseDetailId);
		return SUCCESS;
	}
	
	
}

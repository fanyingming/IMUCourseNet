package com.imu.coursenet.action.teacher;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class ListTeacherCourseDetailsAction extends ManagerBaseAction {
	private List<CourseDetail> courseDetails;

	public List<CourseDetail> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(List<CourseDetail> courseDetails) {
		this.courseDetails = courseDetails;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		courseDetails = courseDetailManager.listCourseDetailByTeacherId(
				user.getUserId(), 0, 10);
		return SUCCESS;
	}

}

package com.imu.coursenet.action.student;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class ShowCourseIntroduceAction extends ManagerBaseAction {

	// private CourseDetail courseDetail;
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
		int id = Integer.parseInt(ctx.getSession().get("courseDetailId")
				.toString());
		courseDetail = courseDetailManager.getCourseDetail(id);
		return SUCCESS;
	}
}

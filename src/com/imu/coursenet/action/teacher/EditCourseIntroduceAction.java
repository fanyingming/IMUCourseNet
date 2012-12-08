package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class EditCourseIntroduceAction extends ManagerBaseAction {

	private CourseDetail courseDetail;
	private String courseIntroduce;

	public String getCourseIntroduce() {
		return courseIntroduce;
	}

	public void setCourseIntroduce(String courseIntroduce) {
		this.courseIntroduce = courseIntroduce;
	}

	@Override
	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		int id = Integer.parseInt(ctx.getSession().get("courseDetailId")
				.toString());
		courseDetail = courseDetailManager.getCourseDetail(id);
		courseDetail.setCourseIntroduce(courseIntroduce);
		if (courseDetailManager.updateCourseDetail(courseDetail) == courseDetailManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;

	}
}

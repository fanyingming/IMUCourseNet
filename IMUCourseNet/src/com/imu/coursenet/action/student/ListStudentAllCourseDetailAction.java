package com.imu.coursenet.action.student;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class ListStudentAllCourseDetailAction extends ManagerBaseAction {
	private List<CourseTaking> courseTakings;

	public List<CourseTaking> getCourseTakings() {
		return courseTakings;
	}

	public void setCourseTakings(List<CourseTaking> courseTakings) {
		this.courseTakings = courseTakings;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		courseTakings = courseTakingManager.listAllCourseTakingByStudentId(user
				.getUserId());
		return SUCCESS;
	}
}

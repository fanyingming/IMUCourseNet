package com.imu.coursenet.action.student;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.Courseware;
import com.opensymphony.xwork2.ActionContext;

public class ListCoursewareAction extends ManagerBaseAction {
	private List<Courseware> coursewares;

	public List<Courseware> getCoursewares() {
		return coursewares;
	}

	public void setCoursewares(List<Courseware> coursewares) {
		this.coursewares = coursewares;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		int courseDetailId = Integer.parseInt(ctx.getSession()
				.get("courseDetailId").toString());
		coursewares = coursewareManager
				.listAllCoursewareByCourseDetailId(courseDetailId);
		return SUCCESS;
	}
}

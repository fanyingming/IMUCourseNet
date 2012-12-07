package com.imu.coursenet.action.teacher;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseWorkRequirement;
import com.opensymphony.xwork2.ActionContext;

public class TeacherListCourseWorkRequirementAction extends ManagerBaseAction{
	private List<CourseWorkRequirement> courseWorkRequirements;

	public List<CourseWorkRequirement> getCourseWorkRequirements() {
		return courseWorkRequirements;
	}

	public void setCourseWorkRequirements(
			List<CourseWorkRequirement> courseWorkRequirements) {
		this.courseWorkRequirements = courseWorkRequirements;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get("courseDetailId");
		courseWorkRequirements=courseWorkRequirementManager.listCourseWorkRequirementByCourseDetailId(courseDetailId);
		return SUCCESS;
	}
	

}

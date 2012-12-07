package com.imu.coursenet.action.student;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseWorkRequirement;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class StudentListCourseWorkRequirementAction extends ManagerBaseAction{
	private List<CourseWorkRequirement> CourseWorkRequirements;
	private Integer courseWorkCounts;
	public List<CourseWorkRequirement> getCourseWorkRequirements() {
		return CourseWorkRequirements;
	}

	public void setCourseWorkRequirements(
			List<CourseWorkRequirement> courseWorkRequirements) {
		CourseWorkRequirements = courseWorkRequirements;
	}

	public Integer getCourseWorkCounts() {
		return courseWorkCounts;
	}

	public void setCourseWorkCounts(Integer courseWorkCounts) {
		this.courseWorkCounts = courseWorkCounts;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get("courseDetailId");
		CourseWorkRequirements=courseWorkRequirementManager.listCourseWorkRequirementByCourseDetailId(courseDetailId);
		courseWorkCounts=CourseWorkRequirements.size();
		return SUCCESS;
	}
	
}

package com.imu.coursenet.action.student;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseWorkRequirement;

public class ShowCourseWorkRequirementDetailAction extends ManagerBaseAction{
	private Integer courseWorkRequirementId;
	private CourseWorkRequirement courseWorkRequirement;
	public Integer getCourseWorkRequirementId() {
		return courseWorkRequirementId;
	}
	public void setCourseWorkRequirementId(Integer courseWorkRequirementId) {
		this.courseWorkRequirementId = courseWorkRequirementId;
	}
	public CourseWorkRequirement getCourseWorkRequirement() {
		return courseWorkRequirement;
	}
	public void setCourseWorkRequirement(CourseWorkRequirement courseWorkRequirement) {
		this.courseWorkRequirement = courseWorkRequirement;
	}
	@Override
	public String execute() throws Exception {
		courseWorkRequirement=courseWorkRequirementManager.getCourseWorkRequirement(courseWorkRequirementId);
		return SUCCESS;
	}
	
}

package com.imu.coursenet.action.teacher;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseWork;

public class ListStudentCourseWorkAction extends ManagerBaseAction{
	private List<CourseWork> courseWorks;
	private Integer courseWorkRequirementId;
	private Integer courseWorkCounts;
	
	public Integer getCourseWorkCounts() {
		return courseWorkCounts;
	}

	public void setCourseWorkCounts(Integer courseWorkCounts) {
		this.courseWorkCounts = courseWorkCounts;
	}

	public List<CourseWork> getCourseWorks() {
		return courseWorks;
	}

	public void setCourseWorks(List<CourseWork> courseWorks) {
		this.courseWorks = courseWorks;
	}

	public Integer getCourseWorkRequirementId() {
		return courseWorkRequirementId;
	}

	public void setCourseWorkRequirementId(Integer courseWorkRequirementId) {
		this.courseWorkRequirementId = courseWorkRequirementId;
	}

	@Override
	public String execute() throws Exception {
		courseWorks=courseWorkManager.listByCourseWorkRequirementId(courseWorkRequirementId);
		courseWorkCounts=courseWorks.size();
		return SUCCESS;
	}
	
	
}

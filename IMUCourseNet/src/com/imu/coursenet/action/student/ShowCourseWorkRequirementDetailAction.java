package com.imu.coursenet.action.student;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class ShowCourseWorkRequirementDetailAction extends ManagerBaseAction {
	private Integer courseWorkRequirementId;
	private CourseWorkRequirement courseWorkRequirement;
	private CourseWork courseWork;
	private String tip;
	public CourseWork getCourseWork() {
		return courseWork;
	}

	public void setCourseWork(CourseWork courseWork) {
		this.courseWork = courseWork;
	}

	public Integer getCourseWorkRequirementId() {
		return courseWorkRequirementId;
	}

	public void setCourseWorkRequirementId(Integer courseWorkRequirementId) {
		this.courseWorkRequirementId = courseWorkRequirementId;
	}

	public CourseWorkRequirement getCourseWorkRequirement() {
		return courseWorkRequirement;
	}

	public void setCourseWorkRequirement(
			CourseWorkRequirement courseWorkRequirement) {
		this.courseWorkRequirement = courseWorkRequirement;
	}

	@Override
	public String execute() throws Exception {
		courseWorkRequirement = courseWorkRequirementManager
				.getCourseWorkRequirement(courseWorkRequirementId);
		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		List<CourseWork> courseWorkList=courseWorkManager.getCourseWorkByCourseWorkRequirementIdAndUserId(courseWorkRequirementId, user.getUserId());
		
		if(courseWorkList.size()==1){
			courseWork=courseWorkList.get(0);
		}else if(courseWorkList.size()>1){
			tip="一个学生提交的一次作业的记录大于1个~";
			return ERROR;
		}
		return SUCCESS;
	}

}

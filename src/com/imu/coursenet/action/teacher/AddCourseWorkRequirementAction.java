package com.imu.coursenet.action.teacher;

import java.util.Date;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class AddCourseWorkRequirementAction extends ManagerBaseAction{
	private String title;
	private String requirementContent;
	private String deadLine;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRequirementContent() {
		return requirementContent;
	}
	public void setRequirementContent(String requirementContent) {
		this.requirementContent = requirementContent;
	}
	
	public String getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get("courseDetailId");
		
		if(courseWorkRequirementManager.addCourseWorkRequirement(courseDetailId, title, requirementContent, new Date())==courseWorkRequirementManager.OP_SUCC){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	
	
}

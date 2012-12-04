package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class EditTeachPlanAction extends ManagerBaseAction {
	
	private CourseDetail courseDetail;
	private String teachPlan;

	
	public String getTeachPlan() {
		return teachPlan;
	}


	public void setTeachPlan(String teachPlan) {
		this.teachPlan = teachPlan;
	}


	@Override
	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		int id=Integer.parseInt(ctx.getSession().get("courseDetailId").toString());
		courseDetail=courseDetailManager.getCourseDetail(id);
		courseDetail.setTeachPlan(teachPlan);
		if (courseDetailManager.updateCourseDetail(courseDetail) == courseDetailManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
		
	}
}

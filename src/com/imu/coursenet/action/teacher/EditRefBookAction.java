package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class EditRefBookAction extends ManagerBaseAction {
	
	private CourseDetail courseDetail;
	private String referenceBook;

	public String getReferenceBook() {
		return referenceBook;
	}

	public void setReferenceBook(String referenceBook) {
		this.referenceBook = referenceBook;
	}
	
	@Override
	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		int id=Integer.parseInt(ctx.getSession().get("courseDetailId").toString());
		courseDetail=courseDetailManager.getCourseDetail(id);
		courseDetail.setReferenceBook(referenceBook);
		if (courseDetailManager.updateCourseDetail(courseDetail) == courseDetailManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
		
	/*	
		@Override
		public String execute() throws Exception {
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("courseDetailId", courseDetailId);
			return SUCCESS;
		}
*/
	}
}

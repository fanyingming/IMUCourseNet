package com.imu.coursenet.action.student;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class SendLetterAction extends ManagerBaseAction{
	private Integer courseDetailId;
	private String title;
	private String content;
	public Integer getCourseDetailId() {
		return courseDetailId;
	}
	public void setCourseDetailId(Integer courseDetailId) {
		this.courseDetailId = courseDetailId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Student student = (Student) ctx.getSession().get("user");
		Teacher teacher=courseDetailManager.getCourseDetail(courseDetailId).getTeacher();
		if(title==null ||title.equals("")){
			return ERROR;
		}
		if(letterManager.addLetter(teacher, student, title, content)==letterManager.OP_SUCC){
			return SUCCESS;
		}
		return ERROR;
	}
	
}

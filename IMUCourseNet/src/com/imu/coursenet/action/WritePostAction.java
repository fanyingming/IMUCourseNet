package com.imu.coursenet.action;
import com.imu.coursenet.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.imu.coursenet.domain.*;
public class WritePostAction extends ManagerBaseAction{
	public String title;
	public String content;
	public int userId;
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
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get("courseDetailId");
		User user = (User) ctx.getSession().get("user");
		postManager.addPost(courseDetailId, user.getUserId(), title, content);
		return SUCCESS;
	}

}

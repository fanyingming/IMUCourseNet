package com.imu.coursenet.action;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;
public class ListPostAction extends ManagerBaseAction{
	private List<Post> posts;

	public List<Post> getPosts() {
		return posts;
	}

	public void setPost(List<Post> posts) {
		this.posts = posts;
	}
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer courseDetailId = (Integer) ctx.getSession().get("courseDetailId");
//		System.out.println("courseDetailId="+courseDetailId);
		posts = postManager.findAllByCourseDetailId(courseDetailId);
		return SUCCESS;

	}

}

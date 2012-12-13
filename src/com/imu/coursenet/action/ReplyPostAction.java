package com.imu.coursenet.action;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ReplyPostAction extends ManagerBaseAction {
	
	private Integer postId;
	public List<PostReply> Postreplys;
	public Post post;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public List<PostReply> getPostreplys() {
		return Postreplys;
	}

	public void setPostreplys(List<PostReply> postreplys) {
		Postreplys = postreplys;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	
	public String execute() throws Exception {
		post=postManager.getPost(postId);
	System.out.println("postcontent="+post.getContent());
		Postreplys = postReplyManager.findbyPostId(postId);
		return SUCCESS;

	}
}

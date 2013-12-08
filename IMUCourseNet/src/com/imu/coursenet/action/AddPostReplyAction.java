package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.imu.coursenet.domain.*;

public class AddPostReplyAction extends ManagerBaseAction {
	
	private String postReply;
	private Integer postId;
	public Post post;
	public Integer userId;
	
	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostReply() {
		return postReply;
	}

	public void setPostReply(String postReply) {
		this.postReply = postReply;
	}
	public String execute() throws Exception {
		post=postManager.getPost(postId);
		userId=post.getUser().getUserId();
		postReplyManager.addPostReply(postReply, postId, userId);
		//是回复数+1还是统计总数
		post.setReplyCounts(postReplyManager.getPostReplyCountsByPostId(postId));
		
		postManager.updatePost(post);
		return SUCCESS;
	}
	

}

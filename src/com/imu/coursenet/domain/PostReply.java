package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class PostReply implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer postReplyId;
	private String content;
	private Date editDate;
	private Post post;
	private User user;

	public PostReply() {

	}

	public Integer getPostReplyId() {
		return postReplyId;
	}

	public void setPostReplyId(Integer postReplyId) {
		this.postReplyId = postReplyId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

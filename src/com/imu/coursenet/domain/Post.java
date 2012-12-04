package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer postId;
	private String title;
	private String content;
	private Date editDate;
	private Integer checkCounts;
	private Integer replyCounts;
	private Course course;
	private User user;

	public Post() {

	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
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

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Integer getCheckCounts() {
		return checkCounts;
	}

	public void setCheckCounts(Integer checkCounts) {
		this.checkCounts = checkCounts;
	}

	public Integer getReplyCounts() {
		return replyCounts;
	}

	public void setReplyCounts(Integer replyCounts) {
		this.replyCounts = replyCounts;
	}

	

	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

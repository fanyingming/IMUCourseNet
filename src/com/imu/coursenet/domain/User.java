package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable{
	private static final long serialVersionUID = 48L;
	
	protected Integer userId;
	
	protected String userAccount;
	
	protected String userName;
	
	protected String userPass;
	
	protected String userMail;
	
	protected Department department;
	
	protected Set<Post> posts=new HashSet<Post>();
	
	protected Set<PostReply> postReplys=new HashSet<PostReply>();
	
	protected Set<Message> messages=new HashSet<Message>();

	public User(){
		
	}
	
	public User(String userAccount,String userName,String userPass,String userMail,Department departments){
		this.userAccount=userAccount;
		this.userPass=userPass;
		this.userName=userName;
		this.userMail=userMail;
		this.department=department;
	}

	

	public Set<Message> getMessages() {
		return messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	public Set<PostReply> getPostReplys() {
		return postReplys;
	}

	public void setPostReplys(Set<PostReply> postReplys) {
		this.postReplys = postReplys;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
}

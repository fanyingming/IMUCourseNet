package com.imu.coursenet.domain;

import java.io.Serializable;

public class Admin implements Serializable{
	private static final long serialVersionUID = 48L;
	//±Í ∂ Ù–‘
	private Integer userId;
	
	private String userAccount;
	
	private String userName;
	
	private String userPass;
	
	private String userMail;

	public Admin(){
		
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

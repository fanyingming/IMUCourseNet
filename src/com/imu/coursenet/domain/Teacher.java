package com.imu.coursenet.domain;

import java.io.Serializable;

public class Teacher 
	extends User
	implements Serializable 
{
	private static final long serialVersionUID = 48L;
	public Teacher(){
		
	}
	public Teacher(String userAccount,String userPass,String userName,String userMail){
		this.userAccount=userAccount;
		this.userPass=userPass;
		this.userName=userName;
		this.userMail=userMail;
		
	}
}

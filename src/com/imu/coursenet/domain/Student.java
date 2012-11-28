package com.imu.coursenet.domain;

import java.io.Serializable;

public class Student 
	extends User
	implements Serializable 
{
	private static final long serialVersionUID = 48L;
	public Student(){
		
	}
	public Student(String userAccount,String userPass,String userName,String userMail){
		this.userAccount=userAccount;
		this.userPass=userPass;
		this.userName=userName;
		this.userMail=userMail;
		
	}
}

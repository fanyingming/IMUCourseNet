package com.imu.coursenet.action;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends UserManagerBaseAction
{
	//�����װ���������username��password����
	private String userAccount;
	private String userPass;
	
	


	public String getUserAccount() {
		return userAccount;
	}




	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}




	public String getUserPass() {
		return userPass;
	}




	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}




	//���崦���û������execute����
	public String execute() throws Exception
	{
		int result = userManager.validLogin(userAccount,userPass); 
		if (result == userManager.LOGIN_ADMIN) {
			
			return "admin";
		}
		else if(result == userManager.LOGIN_TEACHER) {
			
			return "teacher";
		}
		else if(result == userManager.LOGIN_STUDENT){
			
			return "student";
		}
		else
		{
			return INPUT;
		}
	}
}

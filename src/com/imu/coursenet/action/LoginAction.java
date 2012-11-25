package com.imu.coursenet.action;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends UserManagerBaseAction
{
	//定义封装请求参数的username和password属性
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




	//定义处理用户请求的execute方法
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

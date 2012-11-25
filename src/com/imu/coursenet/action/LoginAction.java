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
		
		if (userManager.validLogin(userAccount,userPass)>0) 
		{
			
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}

package com.imu.coursenet.action;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;

public class SaveTeacherAction extends UserManagerBaseAction{
	private String userAccount;
	private String userPass;
	private String userName;
	private String userMail;
	private Integer departmentId;
	
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}



	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String execute() throws Exception {
	
	//	System.out.println("departmentId="+department.getDepartmentId());
		Teacher teacher=new Teacher(userAccount,userPass,userName,userMail);
		userManager.addTeacher(teacher,departmentId);
		return SUCCESS;
	}

	
}

package com.imu.coursenet.action;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateAdminAction extends UserManagerBaseAction{
	private Integer userId;
	private String userAccount;
	private String userPass;
	private String userName;
	private String userMail;
	private Integer departmentId;
	
	
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
		Admin admin = userManager.getAdminById(userId);
		admin.setUserAccount(userAccount);
		admin.setUserPass(userPass);
		admin.setUserName(userName);
		admin.setUserMail(userMail);
		Department department=departmentManager.getDepartment(departmentId);
		admin.setDepartment(department);
		if(userManager.updateAdmin(admin)==userManager.OP_SUCC){
			return SUCCESS;
		}
		else 
			return ERROR;
	}
	
}

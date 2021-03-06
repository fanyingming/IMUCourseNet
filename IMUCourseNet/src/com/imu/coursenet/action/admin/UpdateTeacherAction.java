package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateTeacherAction extends ManagerBaseAction {
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
		Teacher teacher = userManager.getTeacherById(userId);
		teacher.setUserAccount(userAccount);
		teacher.setUserPass(userPass);
		teacher.setUserName(userName);
		teacher.setUserMail(userMail);
		Department department = departmentManager.getDepartment(departmentId);
		teacher.setDepartment(department);
		if (userManager.updateTeacher(teacher) == userManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

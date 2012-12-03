package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.imu.coursenet.domain.*;

public class LoginAction extends ManagerBaseAction {

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

	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		int result = userManager.validLogin(userAccount, userPass);
		User user;
		user = userManager.getUserByAccountAndPass(userAccount, userPass);
		ctx.getSession().put("user", user);
		if (result == userManager.LOGIN_ADMIN) {
			return "admin";
		} else if (result == userManager.LOGIN_TEACHER) {
			return "teacher";
		} else if (result == userManager.LOGIN_STUDENT) {
			return "student";
		} else {
			return INPUT;
		}

	}
}

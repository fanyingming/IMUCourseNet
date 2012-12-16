package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class AdminUpdateAction extends ManagerBaseAction {
	private Integer userId;

	private String userPass;

	private String userMail;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	@Override
	public String execute() throws Exception {
		Admin admin = userManager.getAdminById(userId);

		admin.setUserPass(userPass);

		admin.setUserMail(userMail);

		if (userManager.updateAdmin(admin) == userManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

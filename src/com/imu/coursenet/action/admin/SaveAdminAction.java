package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class SaveAdminAction extends ManagerBaseAction {
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
		
		if(userManager.isExistAdminByAccount(userAccount)){
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("tip", "存在此用户名的管理员，不能重复");
			return ERROR;
		}
		Admin admin = new Admin(userAccount, userPass, userName, userMail);
		userManager.addAdmin(admin, departmentId);
		return SUCCESS;
	}

}

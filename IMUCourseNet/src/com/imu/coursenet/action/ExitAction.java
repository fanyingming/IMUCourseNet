package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class ExitAction extends ManagerBaseAction {

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
//		User user = (User) ctx.getSession().get("user");
		ctx.getSession().clear();
		return SUCCESS;
	}

}

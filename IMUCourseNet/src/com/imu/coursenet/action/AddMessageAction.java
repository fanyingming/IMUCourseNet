package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.imu.coursenet.domain.*;

public class AddMessageAction extends ManagerBaseAction {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		if (user == null) {
			return ERROR;
		}

		messageManager.addMessage(content, user.getUserId());
		return SUCCESS;
	}

}

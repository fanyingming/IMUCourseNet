package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteMessageAction extends ManagerBaseAction {
	private int messageId;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	@Override
	public String execute() throws Exception {
		int result = messageManager.deleteMessage(messageId);
		if (result == messageManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

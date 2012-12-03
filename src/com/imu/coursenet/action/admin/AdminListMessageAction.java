package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
public class AdminListMessageAction extends ManagerBaseAction{
	private List<Message> messages;
	private int messageNum=0;

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public int getMessageNum() {
		return messageNum;
	}

	public void setMessageNum(int messageNum) {
		this.messageNum = messageNum;
	}

	@Override
	public String execute() throws Exception {
		messageNum=messageManager.listAllMessage().size();
		messages=messageManager.listAllMessage();
		return SUCCESS;
	}
	
	
}

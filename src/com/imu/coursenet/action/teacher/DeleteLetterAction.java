package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteLetterAction extends ManagerBaseAction{
	private Integer letterId;

	public Integer getLetterId() {
		return letterId;
	}

	public void setLetterId(Integer letterId) {
		this.letterId = letterId;
	}

	@Override
	public String execute() throws Exception {
		letterManager.deleteLetter(letterId);
		return SUCCESS;
	}
	
}

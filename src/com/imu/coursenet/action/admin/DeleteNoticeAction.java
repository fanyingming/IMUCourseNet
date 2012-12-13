package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteNoticeAction extends ManagerBaseAction {
	private int noticeId;

	


	public int getNoticeId() {
		return noticeId;
	}




	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}




	@Override
	public String execute() throws Exception {
		int result = noticeManager.deleteNotice(noticeId);
		if (result == noticeManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateNoticeAction extends ManagerBaseAction {
	private Notice notice;
	private int noticeId;
	
	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}



	@Override
	// Department getDepartment(int departmentId);
	public String execute() throws Exception {
		notice = noticeManager.getNotice(noticeId);
		return SUCCESS;
	}

}

package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listNoticeAction extends ManagerBaseAction {
	private List<Notice> notices;

	
	public List<Notice> getNotices() {
		return notices;
	}


	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}


	public String execute() throws Exception {
		notices = noticeManager.listAllNotice();
		
		return SUCCESS;

	}

}

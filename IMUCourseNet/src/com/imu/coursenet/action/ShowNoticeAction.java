package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseNotification;
import com.imu.coursenet.domain.Notice;

public class ShowNoticeAction extends ManagerBaseAction {
	private Notice notice;
	private Integer noticeId;

	

	public Notice getNotice() {
		return notice;
	}



	public void setNotice(Notice notice) {
		this.notice = notice;
	}



	public Integer getNoticeId() {
		return noticeId;
	}



	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}



	@Override
	public String execute() throws Exception {
		notice = noticeManager
				.getNotice(noticeId);
		return SUCCESS;
	}

}

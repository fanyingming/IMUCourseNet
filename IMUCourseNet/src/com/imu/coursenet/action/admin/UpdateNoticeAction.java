
package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateNoticeAction extends ManagerBaseAction {
	private Integer noticeId;
	private String noticeTitle;
	private String content;


	public Integer getNoticeId() {
		return noticeId;
	}


	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}


	public String getNoticeTitle() {
		return noticeTitle;
	}


	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String execute() throws Exception {
		Notice notice= noticeManager.getNotice(noticeId);
		notice.setNoticeTitle(noticeTitle);
		
		notice.setContent(content);

	if (noticeManager.updateNotice(notice) == noticeManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

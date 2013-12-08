package com.imu.coursenet.action.admin;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
																																								
import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class AddNoticeAction extends ManagerBaseAction {

	
	private String noticeTitle;
	private String content;
	

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

	Notice notice = new Notice(noticeTitle,content,new Date(),0,"admin") ;
			
		if (noticeManager.addNotice(notice) == noticeManager.OP_SUCC) {

			return SUCCESS;
		} else {
			return ERROR;
		}

	}

}

package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteNewsAction extends ManagerBaseAction {
	private int newsId;

	

	public int getNewsId() {
		return newsId;
	}



	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}



	@Override
	public String execute() throws Exception {
		int result = newsManager.deleteNews(newsId);
		if (result == newsManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

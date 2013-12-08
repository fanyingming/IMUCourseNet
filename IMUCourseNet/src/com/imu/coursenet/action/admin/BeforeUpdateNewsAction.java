package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateNewsAction extends ManagerBaseAction {
	private News news;
	private int newsId;
	
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	@Override
	// Department getDepartment(int departmentId);
	public String execute() throws Exception {
		news = newsManager.getNews(newsId);
		return SUCCESS;
	}

}

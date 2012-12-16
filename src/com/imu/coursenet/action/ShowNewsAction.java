package com.imu.coursenet.action;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseNotification;
import com.imu.coursenet.domain.News;

public class ShowNewsAction extends ManagerBaseAction {
	private News news;
	private Integer newsId;

	
	public News getNews() {
		return news;
	}


	public void setNews(News news) {
		this.news = news;
	}


	public Integer getNewsId() {
		return newsId;
	}


	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}


	@Override
	public String execute() throws Exception {
		news = newsManager
				.getNews(newsId);
		return SUCCESS;
	}

}

package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateNewsAction extends ManagerBaseAction {
	private Integer newsId;
	private String newsTitle;
	private String content;


	public Integer getNewsId() {
		return newsId;
	}


	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}


	public String getNewsTitle() {
		return newsTitle;
	}


	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String execute() throws Exception {
		News news = newsManager.getNews(newsId);
		news.setNewsTitle(newsTitle);
		
		news.setContent(content);

	if (newsManager.updateNews(news) == newsManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

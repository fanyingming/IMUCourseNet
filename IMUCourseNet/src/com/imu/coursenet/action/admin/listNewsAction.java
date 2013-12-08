package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listNewsAction extends ManagerBaseAction {
	private List<News> news;
	private int counts;
	public String execute() throws Exception {
		news = newsManager.listAllNews();
		counts=news.size();
		return SUCCESS;

	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	
}

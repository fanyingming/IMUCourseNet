package com.imu.coursenet.action.admin;

import java.util.ArrayList;
import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class IndexPageListNewsAction extends ManagerBaseAction {
	private List<String> news = new ArrayList<String>();
	private Integer counts;

	public Integer getCounts() {
		return counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}

	public List<String> getNews() {
		return news;
	}

	public void setNews(List<String> news) {
		this.news = news;
	}

	@Override
	public String execute() throws Exception {
		for (int i = 0; i < 7; i++) {
			news.add("01010101010101010" + i);
		}
		counts = news.size();
		return SUCCESS;
	}

}

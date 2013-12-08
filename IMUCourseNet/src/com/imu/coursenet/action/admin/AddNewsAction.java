package com.imu.coursenet.action.admin;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
																																								
import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class AddNewsAction extends ManagerBaseAction {

	
	private String newsTitle;
	private String content;
	

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

	News news = new News(newsTitle,content,new Date(),0,"admin") ;
			
		if (newsManager.addNews(news) == newsManager.OP_SUCC) {

			return SUCCESS;
		} else {
			return ERROR;
		}

	}

}

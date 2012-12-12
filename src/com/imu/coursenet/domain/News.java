package com.imu.coursenet.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class News implements Serializable {
	private static final long serialVersionUID = 48L;
	
	private Integer newsId;
	private String content;
	private String  newsTitle;
	private Integer checkCounts;
	private String  author;
	private Date editDate;


	public Integer getNewsId() {
		return newsId;
	}


	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getNewsTitle() {
		return newsTitle;
	}


	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}


	public Integer getCheckCounts() {
		return checkCounts;
	}


	public void setCheckCounts(Integer checkCounts) {
		this.checkCounts = checkCounts;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Date getEditDate() {
		return editDate;
	}


	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public News() {

	}
	public News(String newsTitle,String content,Date editDate,Integer checkCounts,String  author) {
		this.author=author;
		this.checkCounts=checkCounts;
		this.editDate=editDate;
		this.newsTitle=newsTitle;
		this.content=content;

	}

}

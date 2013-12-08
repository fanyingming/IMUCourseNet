package com.imu.coursenet.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Notice implements Serializable {
	private static final long serialVersionUID = 48L;
	
	private Integer noticeId;
	private String content;
	private String  noticeTitle;
	private Integer checkCounts;
	private String  author;
	private Date editDate;





	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
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


	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Notice() {

	}
	public Notice(String noticeTitle,String content,Date editDate,Integer checkCounts,String  author) {
		this.author=author;
		this.checkCounts=checkCounts;
		this.editDate=editDate;
		this.noticeTitle=noticeTitle;
		this.content=content;

	}

}

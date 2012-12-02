package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class Letter implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer letterId;
	private String title;
	private Date date;
	private String content;
	private Integer state;
	private Student sender;
	private Teacher receiver;
	public Letter(){
		
	}
	
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getLetterId() {
		return letterId;
	}
	public void setLetterId(Integer letterId) {
		this.letterId = letterId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Student getSender() {
		return sender;
	}

	public void setSender(Student sender) {
		this.sender = sender;
	}

	public Teacher getReceiver() {
		return receiver;
	}

	public void setReceiver(Teacher receiver) {
		this.receiver = receiver;
	}
	
	
	
	
}

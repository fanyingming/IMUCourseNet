package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class CourseNotification implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer courseNotificationId;
	private String title;
	private String content;
	private Date editDate;
	private Integer checkCounts;
	private CourseDetail courseDetail;

	public CourseNotification() {

	}

	public CourseNotification(CourseDetail courseDetail, String title,
			String content, Date editDate, int checkCounts) {
		this.courseDetail = courseDetail;
		this.checkCounts = checkCounts;
		this.content = content;
		this.editDate = editDate;
		this.title = title;
	}

	public Integer getCourseNotificationId() {
		return courseNotificationId;
	}

	public void setCourseNotificationId(Integer courseNotificationId) {
		this.courseNotificationId = courseNotificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Integer getCheckCounts() {
		return checkCounts;
	}

	public void setCheckCounts(Integer checkCounts) {
		this.checkCounts = checkCounts;
	}

	public CourseDetail getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}

}

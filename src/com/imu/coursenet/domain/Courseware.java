package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class Courseware implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer coursewareId;
	private String saveLocation;
	private String title;
	private Date uploadDate;
	private Integer downloadCounts;
	private CourseDetail courseDetail;
	public Courseware(){
		
	}
	public Courseware(String saveLocation, String title, Date uploadDate,CourseDetail courseDetail) {
		this.saveLocation=saveLocation;
		this.title=title;
		this.uploadDate=uploadDate;
		this.courseDetail=courseDetail;
	}

	public CourseDetail getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}

	public Integer getCoursewareId() {
		return coursewareId;
	}

	public void setCoursewareId(Integer coursewareId) {
		this.coursewareId = coursewareId;
	}

	public String getSaveLocation() {
		return saveLocation;
	}

	public void setSaveLocation(String saveLocation) {
		this.saveLocation = saveLocation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Integer getDownloadCounts() {
		return downloadCounts;
	}

	public void setDownloadCounts(Integer downloadCounts) {
		this.downloadCounts = downloadCounts;
	}

}

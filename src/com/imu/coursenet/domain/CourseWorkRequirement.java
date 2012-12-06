package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CourseWorkRequirement implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer courseWorkRequirementId;
	private String title;
	private String requirementContent;
	private Date createDate;
	private Date deadLine;
	private CourseDetail courseDetail;
	private Set<CourseWork> courseWorks = new HashSet<CourseWork>();
	public CourseWorkRequirement(){
		
	}
	
	public Set<CourseWork> getCourseWorks() {
		return courseWorks;
	}

	public void setCourseWorks(Set<CourseWork> courseWorks) {
		this.courseWorks = courseWorks;
	}

	public Integer getCourseWorkRequirementId() {
		return courseWorkRequirementId;
	}
	public void setCourseWorkRequirementId(Integer courseWorkRequirementId) {
		this.courseWorkRequirementId = courseWorkRequirementId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRequirementContent() {
		return requirementContent;
	}
	public void setRequirementContent(String requirementContent) {
		this.requirementContent = requirementContent;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public CourseDetail getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}
	
}

package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class CourseWork implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer courseWorkId;
	private String courseWorkLocation;
	private Date editDate;
	private CourseDetail courseDetail;
	private Student student;
	public CourseWork(){
		
	}
	public Integer getCourseWorkId() {
		return courseWorkId;
	}
	public void setCourseWorkId(Integer courseWorkId) {
		this.courseWorkId = courseWorkId;
	}
	public String getCourseWorkLocation() {
		return courseWorkLocation;
	}
	public void setCourseWorkLocation(String courseWorkLocation) {
		this.courseWorkLocation = courseWorkLocation;
	}
	public Date getEditDate() {
		return editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	public CourseDetail getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}

package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;

public class CourseWork implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer courseWorkId;
	private String courseWorkLocation;
	private Date editDate;
	private CourseWorkRequirement courseWorkRequirement;
	private Student student;
	private String title;

	public CourseWork() {

	}

	public CourseWork(String courseWorkLocation, String title,
			CourseWorkRequirement courseWorkRequirement, Student student,
			Date editDate) {
		this.courseWorkLocation = courseWorkLocation;
		this.courseWorkRequirement = courseWorkRequirement;
		this.student = student;
		this.title = title;
		this.editDate = editDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public CourseWorkRequirement getCourseWorkRequirement() {
		return courseWorkRequirement;
	}

	public void setCourseWorkRequirement(
			CourseWorkRequirement courseWorkRequirement) {
		this.courseWorkRequirement = courseWorkRequirement;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}

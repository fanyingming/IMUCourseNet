package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class CourseType implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer courseTypeId;
	private String courseTypeName;
	private String courseTypeDescription;
	private Set<Course> courses = new HashSet<Course>();

	public CourseType() {

	}

	public CourseType(String courseTypeName, String courseTypeDescription) {
		this.courseTypeName = courseTypeName;
		this.courseTypeDescription = courseTypeDescription;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Integer getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}

	public String getCourseTypeDescription() {
		return courseTypeDescription;
	}

	public void setCourseTypeDescription(String courseTypeDescription) {
		this.courseTypeDescription = courseTypeDescription;
	}

}

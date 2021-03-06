package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Course implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer courseId;
	private String courseName;
	private String courseDescription;
	private Department department;
	private CourseType courseType;
	private Set<CourseDetail> courseDetails = new HashSet<CourseDetail>();
	private Set<Post> posts = new HashSet<Post>();

	public Course() {
	}

	public Course(String courseName, String courseDescription) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public Set<CourseDetail> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(Set<CourseDetail> courseDetails) {
		this.courseDetails = courseDetails;
	}

}

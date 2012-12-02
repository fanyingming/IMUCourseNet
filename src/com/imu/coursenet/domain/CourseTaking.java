package com.imu.coursenet.domain;

import java.io.Serializable;

public class CourseTaking implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer courseTakingId;
	private Integer score;
	private CourseDetail courseDetail;
	private Student student;
	public CourseTaking(){
		
	}
	public Integer getCourseTakingId() {
		return courseTakingId;
	}
	public void setCourseTakingId(Integer courseTakingId) {
		this.courseTakingId = courseTakingId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
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

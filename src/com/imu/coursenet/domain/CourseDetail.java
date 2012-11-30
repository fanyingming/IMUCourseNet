package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;
import com.imu.coursenet.domain.*;
public class CourseDetail implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer courseDetailId;
	private String teachPlane;
	private String referenceBook;
	private String courseIntroduce;
	private Date establishDate;
	private Integer state;//-1代表开始，1代表未开始。
	private Course course;
	private Teacher teacher;
	
	public CourseDetail(){
		
	}
	
	public CourseDetail(String teachPlane,String referenceBook,
			String courseIntroduce,Date establishDate,Integer state){
		
	}

	public Integer getCourseDetailId() {
		return courseDetailId;
	}

	public void setCourseDetailId(Integer courseDetailId) {
		this.courseDetailId = courseDetailId;
	}

	public String getTeachPlane() {
		return teachPlane;
	}

	public void setTeachPlane(String teachPlane) {
		this.teachPlane = teachPlane;
	}

	public String getReferenceBook() {
		return referenceBook;
	}

	public void setReferenceBook(String referenceBook) {
		this.referenceBook = referenceBook;
	}

	public String getCourseIntroduce() {
		return courseIntroduce;
	}

	public void setCourseIntroduce(String courseIntroduce) {
		this.courseIntroduce = courseIntroduce;
	}

	public Date getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}

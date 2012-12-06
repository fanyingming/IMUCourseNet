package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.imu.coursenet.domain.*;

public class CourseDetail implements Serializable {
	private static final long serialVersionUID = 48L;
	private Integer courseDetailId;
	private String teachPlan;
	private String referenceBook;
	private String courseIntroduce;
	private Date establishDate;
	private Integer state;// -1代表未开始，1代表开始。
	private Course course;
	private Teacher teacher;
	private Set<Courseware> coursewares = new HashSet<Courseware>();
	private Set<CourseNotification> courseNotifications = new HashSet<CourseNotification>();
	private Set<CourseWorkRequirement> courseWorkRequirements = new HashSet<CourseWorkRequirement>();
	public CourseDetail() {

	}

	public CourseDetail(String teachPlane, String referenceBook,
			String courseIntroduce, Date establishDate, Integer state) {

	}

	
	

	public Set<CourseWorkRequirement> getCourseWorkRequirements() {
		return courseWorkRequirements;
	}

	public void setCourseWorkRequirements(
			Set<CourseWorkRequirement> courseWorkRequirements) {
		this.courseWorkRequirements = courseWorkRequirements;
	}

	public Set<CourseNotification> getCourseNotifications() {
		return courseNotifications;
	}

	public void setCourseNotifications(
			Set<CourseNotification> courseNotifications) {
		this.courseNotifications = courseNotifications;
	}

	public Set<Courseware> getCoursewares() {
		return coursewares;
	}

	public void setCoursewares(Set<Courseware> coursewares) {
		this.coursewares = coursewares;
	}

	public Integer getCourseDetailId() {
		return courseDetailId;
	}

	public void setCourseDetailId(Integer courseDetailId) {
		this.courseDetailId = courseDetailId;
	}

	

	public String getTeachPlan() {
		return teachPlan;
	}

	public void setTeachPlan(String teachPlan) {
		this.teachPlan = teachPlan;
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

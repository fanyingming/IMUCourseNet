package com.imu.coursenet.domain;

import java.io.Serializable;

public class CourseType implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer courseTypeId;
	private String courseTypeName;
	private String courseTypeDescription;
	
	
	public CourseType(){
		
	}
	public CourseType(String courseTypeName,String courseTypeDescription){
		
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

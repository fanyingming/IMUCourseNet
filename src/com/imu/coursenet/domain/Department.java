package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.*;

public class Department implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer departmentId;
	private String  departmentName;
	private String  departmentDescription;
	private Set<User> users = new HashSet<User>();
	private Set<Specialty> specialtys = new HashSet<Specialty>();
	private Set<Course> courses = new HashSet<Course>();
	public Department(){
		
	}
	public Department(String departmentName,String departmentDescription){
	
		this.departmentName=departmentName;
		this.departmentDescription=departmentDescription;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Set<Specialty> getSpecialtys() {
		return specialtys;
	}
	public void setSpecialtys(Set<Specialty> specialtys) {
		this.specialtys = specialtys;
	}
	
}

package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.*;

public class Department implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer departmentId;
	private String  departmentName;
	private String  departmentDescription;
	private Set<User> users = new HashSet<User>();
	public Department(){
		
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
	
}

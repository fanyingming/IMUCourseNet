package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Specialty implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer specialtyId;
	private String specialtyName;
	private String specialtyDescription;
	private Department department;
	private Set<Student> students = new HashSet<Student>();
	public Specialty(String specialtyName,String specialtyDescription){
		this.specialtyName=specialtyName;
		this.specialtyDescription=specialtyDescription;
		
	}
	public Specialty(){
		
	}
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Integer getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}
	public String getSpecialtyName() {
		return specialtyName;
	}
	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}
	public String getSpecialtyDescription() {
		return specialtyDescription;
	}
	public void setSpecialtyDescription(String specialtyDescription) {
		this.specialtyDescription = specialtyDescription;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}

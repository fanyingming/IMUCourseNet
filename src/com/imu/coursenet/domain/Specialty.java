package com.imu.coursenet.domain;

import java.io.Serializable;

public class Specialty implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer specialtyId;
	private String specialtyName;
	private String specialtyDescription;
	private Department department;
	public Specialty(String specialtyName,String specialtyDescription,Department department){
		this.specialtyName=specialtyName;
		this.specialtyDescription=specialtyDescription;
		this.department=department;
	}
	public Specialty(){
		
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

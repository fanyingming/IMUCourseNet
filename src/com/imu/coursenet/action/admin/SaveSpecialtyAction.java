package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class SaveSpecialtyAction extends ManagerBaseAction{

	private String specialtyName;
	private Integer departmentId;
	private String specialtyDescription;
	


	public String getSpecialtyName() {
		return specialtyName;
	}



	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}



	public Integer getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}



	public String getSpecialtyDescription() {
		return specialtyDescription;
	}



	public void setSpecialtyDescription(String specialtyDescription) {
		this.specialtyDescription = specialtyDescription;
	}



	@Override
	public String execute() throws Exception {
		
		Specialty specialty=new Specialty(specialtyName,specialtyDescription);
		specialtyManager.addSpecialty(specialty,departmentId);
		return SUCCESS;
		
	}


	
}

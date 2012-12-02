package com.imu.coursenet.action.admin;


import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listSpecialtyAction extends ManagerBaseAction{
	private List<Specialty> specialtys;

	public List<Specialty> getSpecialtys() {
		return specialtys;
	}

	public void setSpecialtys(List<Specialty> specialtys) {
		this.specialtys = specialtys;
	}

	public String execute() throws Exception{
		specialtys=specialtyManager.listAllSpecialty();
		return SUCCESS;
		
	}

	
}

package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteSpecialtyAction extends ManagerBaseAction{
	private int specialtyId;


	public int getSpecialtyId() {
		return specialtyId;
	}


	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}

	@Override
	public String execute() throws Exception {
		int result=specialtyManager.deleteSpecialty(specialtyId);
		if(result == specialtyManager.OP_SUCC){
			return SUCCESS;
		}
		else
			return ERROR;
	}
	
}

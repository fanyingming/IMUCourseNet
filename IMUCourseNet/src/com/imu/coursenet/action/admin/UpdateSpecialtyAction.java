package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateSpecialtyAction extends ManagerBaseAction {
	private Integer specialtyId;
	private String specialtyDescription;
	private String specialtyName;
	private Integer departmentId;

	public Integer getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}

	public String getSpecialtyDescription() {
		return specialtyDescription;
	}

	public void setSpecialtyDescription(String specialtyDescription) {
		this.specialtyDescription = specialtyDescription;
	}

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

	@Override
	public String execute() throws Exception {
		Specialty specialty = specialtyManager.getSpecialty(specialtyId);
		specialty.setSpecialtyName(specialtyName);
		specialty.setSpecialtyDescription(specialtyDescription);

		if (specialtyManager.updateSpecialty(specialty) == specialtyManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

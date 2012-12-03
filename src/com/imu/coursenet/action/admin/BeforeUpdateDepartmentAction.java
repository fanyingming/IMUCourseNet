package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateDepartmentAction extends ManagerBaseAction {
	private Department department;
	private int departmentId;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	// Department getDepartment(int departmentId);
	public String execute() throws Exception {
		department = departmentManager.getDepartment(departmentId);
		return SUCCESS;
	}

}

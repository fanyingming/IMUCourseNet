package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;

public class DeleteDepartmentAction extends ManagerBaseAction {
	private int departmentId;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String execute() throws Exception {
		int result = departmentManager.deleteDepartment(departmentId);
		if (result == userManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

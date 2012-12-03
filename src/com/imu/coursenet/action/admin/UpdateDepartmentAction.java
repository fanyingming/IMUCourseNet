package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class UpdateDepartmentAction extends ManagerBaseAction {
	private Integer departmentId;
	private String departmentDescription;
	private String departmentName;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String execute() throws Exception {
		Department department = departmentManager.getDepartment(departmentId);
		department.setDepartmentName(departmentName);
		department.setDepartmentDescription(departmentDescription);

		if (departmentManager.updateDepartment(department) == departmentManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

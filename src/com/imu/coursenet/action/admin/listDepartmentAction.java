package com.imu.coursenet.action.admin;


import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listDepartmentAction extends ManagerBaseAction{
	private List<Department> departments;

	public String execute() throws Exception{
		departments=departmentManager.listAllDepartment();
		return SUCCESS;
		
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
}

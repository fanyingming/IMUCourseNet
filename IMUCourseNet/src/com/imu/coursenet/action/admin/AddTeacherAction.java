package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class AddTeacherAction extends ManagerBaseAction {
	private List<Department> departments;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String execute() throws Exception {
		departments = departmentManager.listAllDepartment();
		return SUCCESS;
	}

}

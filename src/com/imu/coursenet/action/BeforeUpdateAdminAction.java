package com.imu.coursenet.action;

import java.util.List;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateAdminAction extends UserManagerBaseAction{
	private Admin admin;
	private int userId;
	private List<Department> departments;
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String execute() throws Exception {
		admin=userManager.getAdminById(userId);
		departments=departmentManager.listAllDepartment();
		return SUCCESS;
	}
	
}

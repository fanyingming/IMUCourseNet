package com.imu.coursenet.action;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;

public class SaveDepartmentAction extends UserManagerBaseAction{
//	private  Integer departmentId;
	private String departmentName;
	private String departmentDescription;
	
	@Override
	public String execute() throws Exception {
	
	//	System.out.println("departmentId="+department.getDepartmentId());
		Department department=new Department(departmentName,departmentDescription);
		departmentManager.addDepartment(department);
		return SUCCESS;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	
}

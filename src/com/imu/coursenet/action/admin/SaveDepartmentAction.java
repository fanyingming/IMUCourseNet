package com.imu.coursenet.action.admin;

import org.apache.struts2.ServletActionContext;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class SaveDepartmentAction extends ManagerBaseAction {

	private String departmentName;
	private String departmentDescription;

	@Override
	public String execute() throws Exception {
		
		Department department = new Department(departmentName,
				departmentDescription);
		if(departmentManager.addDepartment(department)==departmentManager.OP_SUCC){
			
			return SUCCESS;
		}else{
			return ERROR;
		}
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

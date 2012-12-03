package com.imu.coursenet.action.admin;


import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class AdminShowInfoAction extends ManagerBaseAction{
	private Admin admin;
	private int department_Id;
	private List<Department> departments;
	

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
	public String execute() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();
		User user=(User)ctx.getSession().get("user");
		admin=userManager.getAdminById(user.getUserId());
		department_Id=admin.getDepartment().getDepartmentId();
		departments=departmentManager.listAllDepartment();
		return SUCCESS;
	
	}

	
}

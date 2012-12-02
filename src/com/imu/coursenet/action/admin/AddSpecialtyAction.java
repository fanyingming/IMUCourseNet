package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class AddSpecialtyAction extends ManagerBaseAction{
	private List<Specialty> specialtys;
	private List<Department> departments;
	
	public List<Specialty> getSpecialtys() {
		return specialtys;
	}

	public void setSpecialtys(List<Specialty> specialtys) {
		this.specialtys = specialtys;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


	@Override
	public String execute() throws Exception {
		specialtys = specialtyManager.listAllSpecialty();
		departments = departmentManager.listAllDepartment();
		return SUCCESS;
	}
	
}

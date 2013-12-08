package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

/*
 * 这个action用来列出所有部门，以便添加管理员
 */
public class AddStudentAction extends ManagerBaseAction {
	private List<Department> departments;
	private List<Specialty> specialtys;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Specialty> getSpecialtys() {
		return specialtys;
	}

	public void setSpecialtys(List<Specialty> specialtys) {
		this.specialtys = specialtys;
	}

	@Override
	public String execute() throws Exception {
		departments = departmentManager.listAllDepartment();
		specialtys = specialtyManager.listAllSpecialty();
		return SUCCESS;
	}

}

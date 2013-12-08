package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateSpecialtyAction extends ManagerBaseAction {
	private Specialty specialty;
	private int specialtyId;
	private int department_Id;
	private List<Department> departments;

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public int getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}

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

	@Override
	// Department getDepartment(int departmentId);
	public String execute() throws Exception {
		specialty = specialtyManager.getSpecialty(specialtyId);
		department_Id = specialty.getDepartment().getDepartmentId();
		departments = departmentManager.listAllDepartment();
		return SUCCESS;
	}

}

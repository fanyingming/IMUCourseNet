package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class BeforeUpdateStudentAction extends ManagerBaseAction {
	private Student student;
	private int userId;
	private int department_Id;
	private List<Department> departments;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	@Override
	public String execute() throws Exception {
		student = userManager.getStudentById(userId);
		department_Id = student.getDepartment().getDepartmentId();
		departments = departmentManager.listAllDepartment();
		return SUCCESS;
	}

}

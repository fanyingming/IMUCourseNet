package com.imu.coursenet.action.teacher;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class TeaShowInfoAction extends ManagerBaseAction {
	private Teacher teacher;
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

	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		teacher = userManager.getTeacherById(user.getUserId());
		department_Id = teacher.getDepartment().getDepartmentId();
		departments = departmentManager.listAllDepartment();
		return SUCCESS;

	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

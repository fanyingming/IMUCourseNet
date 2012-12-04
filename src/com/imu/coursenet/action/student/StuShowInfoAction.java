package com.imu.coursenet.action.student;


import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
import com.opensymphony.xwork2.ActionContext;

public class StuShowInfoAction extends ManagerBaseAction{
	private Student student;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public String execute() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();
		User user=(User)ctx.getSession().get("user");
		student=userManager.getStudentById(user.getUserId());
		department_Id=student.getDepartment().getDepartmentId();
		departments=departmentManager.listAllDepartment();
		return SUCCESS;
	
	}
}

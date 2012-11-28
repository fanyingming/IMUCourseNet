package com.imu.coursenet.action.admin;

import java.util.List;


import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;


public class listStudentAction extends ManagerBaseAction{
	private List<Student> students;
	
	public String execute() throws Exception{
		students=userManager.listAllStudent();
		return SUCCESS;
		
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}

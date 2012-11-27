package com.imu.coursenet.action;

import java.util.List;


import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;


public class listStudentAction extends UserManagerBaseAction{
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

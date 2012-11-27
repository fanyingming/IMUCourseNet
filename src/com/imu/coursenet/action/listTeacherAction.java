package com.imu.coursenet.action;

import java.util.List;

import com.imu.coursenet.action.base.UserManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listTeacherAction extends UserManagerBaseAction{
	private List<Teacher> teachers;
	private int counts;
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public String execute() throws Exception{
		teachers=userManager.listAllTeacher();
		counts=teachers.size();
		return SUCCESS;
		
	}

	
}

package com.imu.coursenet.action.student;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;
public class ShowStudentMainPageAction extends ManagerBaseAction{
	private List<CourseTaking> courseTakings;

	public List<CourseTaking> getCourseTakings() {
		return courseTakings;
	}

	public void setCourseTakings(List<CourseTaking> courseTakings) {
		this.courseTakings = courseTakings;
	}
	
}

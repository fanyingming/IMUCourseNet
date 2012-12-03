package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class AdminListCourseTakingAction extends ManagerBaseAction {
	private List<CourseTaking> courseTakings;

	public List<CourseTaking> getCourseTakings() {
		return courseTakings;
	}

	public void setCourseTakings(List<CourseTaking> courseTakings) {
		this.courseTakings = courseTakings;
	}

	@Override
	public String execute() throws Exception {
		courseTakings = courseTakingManager.listAllCourseTaking();
		return SUCCESS;
	}

}

package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listAdminAction extends ManagerBaseAction {
	private List<Admin> admins;
	private int counts;

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public String execute() throws Exception {
		admins = userManager.listAllAdmin();
		counts = admins.size();
		return SUCCESS;

	}
}

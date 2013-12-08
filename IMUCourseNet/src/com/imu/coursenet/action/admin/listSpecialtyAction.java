package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listSpecialtyAction extends ManagerBaseAction {
	private List<Specialty> specialtys;
	private int totalRecordCounts;// 总记录数
	private int totalPageCounts;// 总页数
	private int currentPage = 1;
	private int pageSize = 10;

	public int getTotalRecordCounts() {
		return totalRecordCounts;
	}

	public void setTotalRecordCounts(int totalRecordCounts) {
		this.totalRecordCounts = totalRecordCounts;
	}

	public int getTotalPageCounts() {
		return totalPageCounts;
	}

	public void setTotalPageCounts(int totalPageCounts) {
		this.totalPageCounts = totalPageCounts;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Specialty> getSpecialtys() {
		return specialtys;
	}

	public void setSpecialtys(List<Specialty> specialtys) {
		this.specialtys = specialtys;
	}

	public String execute() throws Exception {

		totalRecordCounts =specialtyManager.totalSpecialtyCounts();
		totalPageCounts = (totalRecordCounts + pageSize - 1) / pageSize;
		if (currentPage <= 0) {
			currentPage = 1;
		}
		if (currentPage > totalPageCounts && currentPage > 0) {
			currentPage = totalPageCounts;
		}
		specialtys = specialtyManager.listAllSpecialty(pageSize * (currentPage - 1),
				pageSize);

		return SUCCESS;
	}
}

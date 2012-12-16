package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listStudentAction extends ManagerBaseAction {
	private List<Student> students;
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String execute() throws Exception {

		totalRecordCounts = userManager.totalStudentCounts();
		totalPageCounts = (totalRecordCounts + pageSize - 1) / pageSize;
		if (currentPage <= 0) {
			currentPage = 1;
		}
		if (currentPage > totalPageCounts && currentPage > 0) {
			currentPage = totalPageCounts;
		}
		students = userManager.listAllStudent(pageSize * (currentPage - 1),
				pageSize);

		return SUCCESS;
	}
}

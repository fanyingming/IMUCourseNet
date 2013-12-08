package com.imu.coursenet.action.admin;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class listTeacherAction extends ManagerBaseAction {
	private List<Teacher> teachers;
	private int totalRecordCounts;//总记录数
	private int totalPageCounts;//总页数
	private int currentPage=1;
	private int pageSize=10;

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}


	public String execute() throws Exception {
	
	

		
		totalRecordCounts=userManager.totalTeacherCounts();
		totalPageCounts=(totalRecordCounts+pageSize-1)/pageSize;
		if(currentPage<=0){
			currentPage=1;
		}
		if(currentPage>totalPageCounts && currentPage>0){
			currentPage=totalPageCounts;
		}
		teachers = userManager.listAllTeacher(pageSize*(currentPage-1),pageSize);
		 
		return SUCCESS;

	}

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

}

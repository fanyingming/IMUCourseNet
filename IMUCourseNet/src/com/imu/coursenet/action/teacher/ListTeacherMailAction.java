package com.imu.coursenet.action.teacher;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.Letter;
import com.imu.coursenet.domain.Teacher;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class ListTeacherMailAction extends ManagerBaseAction{
	private List<Letter> letters;
	private int totalRecordCounts;//总记录数
	private int totalPageCounts;//总页数
	private int currentPage=1;
	private int pageSize=10;

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

	public List<Letter> getLetters() {
		return letters;
	}

	public void setLetters(List<Letter> letters) {
		this.letters = letters;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Teacher teacher = (Teacher) ctx.getSession().get("user");
		letters=letterManager.listLetterByReceiverId(teacher.getUserId());
		totalRecordCounts=letters.size();
		return SUCCESS; 
	}
	
}

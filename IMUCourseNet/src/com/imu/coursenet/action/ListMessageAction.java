package com.imu.coursenet.action;

import java.util.List;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.*;

public class ListMessageAction extends ManagerBaseAction {
	private List<Message> messages;
	private int totalRecordCounts;//总记录数
	private int totalPageCounts;//总页数
	private int currentPage=1;
	private int pageSize=5;

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

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}



	@Override
	public String execute() throws Exception {
		totalRecordCounts=messageManager.getTotalMessageCounts();
		totalPageCounts=(totalRecordCounts+pageSize-1)/pageSize;
		if(currentPage<=0){
			currentPage=1;
		}
		if(currentPage>totalPageCounts && currentPage>0){
			currentPage=totalPageCounts;
		}	
		
		messages = messageManager.listAllMessage(pageSize*(currentPage-1),pageSize);

		return SUCCESS;
	}

}

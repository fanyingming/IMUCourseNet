package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.Letter;

public class ShowMailDetailAction extends ManagerBaseAction{
	private Letter letter;
	private Integer letterId;
	
	public Integer getLetterId() {
		return letterId;
	}

	public void setLetterId(Integer letterId) {
		this.letterId = letterId;
	}

	public Letter getLetter() {
		return letter;
	}

	public void setLetter(Letter letter) {
		this.letter = letter;
	}

	@Override
	public String execute() throws Exception {
		if(letterId==null){
			return ERROR;
		}
		letter=letterManager.getLetter(letterId);
		return SUCCESS;
	}
	
}

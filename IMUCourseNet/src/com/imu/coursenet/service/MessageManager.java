package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface MessageManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Message> listAllMessage();

	List<Message> listAllMessage(int offset,int pageSize);
	
	int addMessage(String content, int userId);

	int deleteMessage(int messageId);

	// int updateMessage(Message message);
	
	Message getMessage(int messageId);
	
	int getTotalMessageCounts();
}

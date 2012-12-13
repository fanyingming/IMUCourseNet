package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface MessageDao {
	Message get(Integer messageId);

	Integer save(Message message);

	void update(Message message);

	void delete(Message message);

	void delete(Integer messageId);

	List<Message> findAll();
	
	List<Message> findAll(int offset,int pageSize);
	
	int getAllMessageCounts();
}

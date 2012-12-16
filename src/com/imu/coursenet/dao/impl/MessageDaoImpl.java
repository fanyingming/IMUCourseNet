package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.Message;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class MessageDaoImpl extends YeekuHibernateDaoSupport implements
		MessageDao {

	@Override
	public Message get(Integer messageId) {
		return getHibernateTemplate().get(Message.class, messageId);
	}

	@Override
	public Integer save(Message message) {
		return (Integer) getHibernateTemplate().save(message);
	}

	@Override
	public void update(Message message) {
		getHibernateTemplate().update(message);

	}

	@Override
	public void delete(Message message) {
		getHibernateTemplate().delete(message);

	}

	@Override
	public void delete(Integer messageId) {
		getHibernateTemplate().delete(get(messageId));

	}

	@Override
	public List<Message> findAll() {
		return (List<Message>) getHibernateTemplate().find("from Message order by editDate desc");
	}

	@Override
	public List<Message> findAll(int offset, int pageSize) {
		return this.findByPage("from Message order by editDate desc", offset, pageSize);
		
	}

	@Override
	public int getAllMessageCounts() {
		return this.findAll().size();
	}

}

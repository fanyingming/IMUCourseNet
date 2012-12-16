package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.Letter;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class LetterDaoImpl extends YeekuHibernateDaoSupport implements
		LetterDao {

	@Override
	public Letter get(Integer letterId) {
		return getHibernateTemplate().get(Letter.class, letterId);
	}

	@Override
	public Integer save(Letter letter) {
		return (Integer) getHibernateTemplate().save(letter);
	}

	@Override
	public void update(Letter letter) {
		getHibernateTemplate().update(letter);

	}

	@Override
	public void delete(Letter letter) {
		getHibernateTemplate().delete(letter);

	}

	@Override
	public void delete(Integer letterId) {
		getHibernateTemplate().delete(get(letterId));

	}

	@Override
	public List<Letter> findAll() {
		return (List<Letter>) getHibernateTemplate().find("from Letter ");
	}

	@Override
	public List<Letter> findByReceiverId(Integer userId) {
		return (List<Letter>) getHibernateTemplate().find("from Letter l where l.receiver.userId=?",userId);
	}

}

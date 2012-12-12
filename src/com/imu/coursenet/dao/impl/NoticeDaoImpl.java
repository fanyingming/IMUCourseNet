package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.News;
import com.imu.coursenet.domain.Notice;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class NoticeDaoImpl extends YeekuHibernateDaoSupport implements NoticeDao {
	
	@Override
	public Notice get(Integer noticeId) {
		return getHibernateTemplate().get(Notice.class, noticeId);
	}

	@Override
	public Integer save(Notice notice) {
		return (Integer) getHibernateTemplate().save(notice);
	}

	@Override
	public void update(Notice notice) {
		getHibernateTemplate().update(notice);

	}

	@Override
	public void delete(Notice notice) {
		getHibernateTemplate().delete(notice);

	}

	@Override
	public void delete(Integer noticeId) {
		getHibernateTemplate().delete(get(noticeId));

	}

	@Override
	public List<Notice> findAll() {
		return (List<Notice>) getHibernateTemplate().find("from Notice ");
	}

}

package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.News;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class NewsDaoImpl extends YeekuHibernateDaoSupport implements NewsDao {

	@Override
	public News get(Integer newsId) {
		return getHibernateTemplate().get(News.class, newsId);
	}

	@Override
	public Integer save(News news) {
		return (Integer) getHibernateTemplate().save(news);
	}

	@Override
	public void update(News news) {
		getHibernateTemplate().update(news);

	}

	@Override
	public void delete(News news) {
		getHibernateTemplate().delete(news);

	}

	@Override
	public void delete(Integer newsId) {
		getHibernateTemplate().delete(get(newsId));

	}

	@Override
	public List<News> findAll() {
		return (List<News>) getHibernateTemplate().find("from News ");
	}

}

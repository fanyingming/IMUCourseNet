package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.CourseWork;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseWorkDaoImpl extends YeekuHibernateDaoSupport implements
		CourseWorkDao {

	@Override
	public CourseWork get(Integer courseWorkId) {
		return getHibernateTemplate().get(CourseWork.class, courseWorkId);
	}

	@Override
	public Integer save(CourseWork courseWork) {
		return (Integer) getHibernateTemplate().save(courseWork);
	}

	@Override
	public void update(CourseWork courseWork) {
		getHibernateTemplate().update(courseWork);

	}

	@Override
	public void delete(CourseWork courseWork) {
		getHibernateTemplate().delete(courseWork);

	}

	@Override
	public void delete(Integer courseWorkId) {
		getHibernateTemplate().delete(get(courseWorkId));

	}

	@Override
	public List<CourseWork> findAll() {
		return (List<CourseWork>) getHibernateTemplate().find(
				"from CourseWork ");
	}

}

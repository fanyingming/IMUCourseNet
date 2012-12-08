package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.CourseNotification;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseNotificationDaoImpl extends YeekuHibernateDaoSupport
		implements CourseNotificationDao {

	@Override
	public CourseNotification get(Integer courseNotificationId) {
		return getHibernateTemplate().get(CourseNotification.class,
				courseNotificationId);
	}

	@Override
	public Integer save(CourseNotification courseNotification) {
		return (Integer) getHibernateTemplate().save(courseNotification);
	}

	@Override
	public void update(CourseNotification courseNotification) {
		getHibernateTemplate().update(courseNotification);

	}

	@Override
	public void delete(CourseNotification courseNotification) {
		getHibernateTemplate().delete(courseNotification);

	}

	@Override
	public void delete(Integer courseNotificationId) {
		getHibernateTemplate().delete(get(courseNotificationId));

	}

	@Override
	public List<CourseNotification> findAll() {
		return (List<CourseNotification>) getHibernateTemplate().find(
				"from CourseNotification ");
	}

	@Override
	public List<CourseNotification> findByCourseDetailId(Integer courseDetailId) {
		return (List<CourseNotification>) getHibernateTemplate()
				.find("from CourseNotification c where c.courseDetail.courseDetailId=?",
						courseDetailId);
	}

}

package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.Courseware;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CoursewareDaoImpl extends YeekuHibernateDaoSupport implements
		CoursewareDao {

	@Override
	public Courseware get(Integer coursewareId) {
		return getHibernateTemplate().get(Courseware.class, coursewareId);
	}

	@Override
	public Integer save(Courseware courseware) {
		return (Integer) getHibernateTemplate().save(courseware);
	}

	@Override
	public void update(Courseware courseware) {
		getHibernateTemplate().update(courseware);

	}

	@Override
	public void delete(Courseware courseware) {
		getHibernateTemplate().delete(courseware);

	}

	@Override
	public void delete(Integer coursewareId) {
		getHibernateTemplate().delete(get(coursewareId));

	}

	@Override
	public List<Courseware> findAll() {
		return (List<Courseware>) getHibernateTemplate().find(
				"from Courseware ");
	}

	@Override
	public List<Courseware> findByCourseDetailId(Integer courseDetailId) {
		return (List<Courseware>) getHibernateTemplate().find(
				"from Courseware c where c.courseDetail.courseDetailId=?",courseDetailId);
	}

	
}

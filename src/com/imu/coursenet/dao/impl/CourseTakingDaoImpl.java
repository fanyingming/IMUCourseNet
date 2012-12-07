package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.CourseTaking;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseTakingDaoImpl 
	extends YeekuHibernateDaoSupport 
	implements CourseTakingDao 
{

	@Override
	public CourseTaking get(Integer courseTakingId) {
		return getHibernateTemplate().get(CourseTaking.class, courseTakingId);
	}

	@Override
	public Integer save(CourseTaking courseTaking) {
		return (Integer) getHibernateTemplate().save(courseTaking);
	}

	@Override
	public void update(CourseTaking courseTaking) {
		getHibernateTemplate().update(courseTaking);

	}

	@Override
	public void delete(CourseTaking courseTaking) {
		getHibernateTemplate().delete(courseTaking);

	}

	@Override
	public void delete(Integer courseTakingId) {
		getHibernateTemplate().delete(get(courseTakingId));

	}

	@Override
	public List<CourseTaking> findAll() {
		return (List<CourseTaking>) getHibernateTemplate().find(
				"from CourseTaking ");
	}

	@Override
	public List<CourseTaking> findByStudentId(Integer studentId, int offset,
			int pageSize) {
		return this.findByPage("from CourseTaking c where c.student.userId=?",
				studentId, offset, pageSize);
	}

	@Override
	public List<CourseTaking> findAllByStudentId(int studentId) {
		return (List<CourseTaking>) getHibernateTemplate().find(
				"from CourseTaking c where c.student.userId=?",studentId);
	}
	
	

}

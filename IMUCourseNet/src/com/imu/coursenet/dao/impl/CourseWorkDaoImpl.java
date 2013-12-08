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
		System.out.println("======in dao");
		CourseWork courseWork=getHibernateTemplate().get(CourseWork.class, courseWorkId);
		if(courseWork==null)
			System.out.println("======courseWork null");
		else
			System.out.println("======courseWork not null");
		return courseWork;
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

	@Override
	public List<CourseWork> findByCourseWorkRequirementId(
			Integer courseWorkRequirementId) {
		return (List<CourseWork>) getHibernateTemplate()
				.find("from CourseWork c where c.courseWorkRequirement.courseWorkRequirementId=?",
						courseWorkRequirementId);
	}

	@Override
	public List<CourseWork> findByCourseWorkRequirementIdAndUserId(
			Integer courseWorkRequirementId, Integer userId) {
		return (List<CourseWork>) getHibernateTemplate()
				.find("from CourseWork c where c.courseWorkRequirement.courseWorkRequirementId=? and c.student.userId=?",
						courseWorkRequirementId,userId);
	}

	@Override
	public List<CourseWork> findByUserId(Integer userId) {
		return (List<CourseWork>) getHibernateTemplate()
				.find("from CourseWork c where c.student.userId=?",
						userId);
	}

	@Override
	public List<CourseWork> findByCourseWorkId(Integer courseWorkId) {
		System.out.println("in courseWorkDao,courseWorkId="+courseWorkId);
		return (List<CourseWork>) getHibernateTemplate()
				.find("from CourseWork c where c.courseWorkId=?",
						courseWorkId);
	}

}

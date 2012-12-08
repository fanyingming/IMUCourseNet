package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseWork;
import com.imu.coursenet.domain.CourseWorkRequirement;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseWorkRequirementDaoImpl extends YeekuHibernateDaoSupport
		implements CourseWorkRequirementDao {

	@Override
	public CourseWorkRequirement get(Integer courseWorkRequirementId) {
		return getHibernateTemplate().get(CourseWorkRequirement.class,
				courseWorkRequirementId);
	}

	@Override
	public Integer save(CourseWorkRequirement courseWorkRequirement) {
		return (Integer) getHibernateTemplate().save(courseWorkRequirement);
	}

	@Override
	public void update(CourseWorkRequirement courseWorkRequirement) {
		getHibernateTemplate().update(courseWorkRequirement);

	}

	@Override
	public void delete(CourseWorkRequirement courseWorkRequirement) {
		getHibernateTemplate().delete(courseWorkRequirement);

	}

	@Override
	public void delete(Integer courseWorkRequirementId) {
		getHibernateTemplate().delete(get(courseWorkRequirementId));

	}

	@Override
	public List<CourseWorkRequirement> findAll() {
		return (List<CourseWorkRequirement>) getHibernateTemplate().find(
				"from CourseWorkRequirement ");
	}

	@Override
	public List<CourseWorkRequirement> findByCourseDetailId(
			Integer courseDetailId) {
		return (List<CourseWorkRequirement>) getHibernateTemplate()
				.find("from CourseWorkRequirement c where c.courseDetail.courseDetailId=?",
						courseDetailId);
	}

}

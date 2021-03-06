package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Admin;
import com.imu.coursenet.domain.CourseType;
import com.imu.coursenet.domain.Department;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseTypeDaoImpl extends YeekuHibernateDaoSupport implements
		CourseTypeDao {

	@Override
	public CourseType get(Integer courseTypeId) {
		return getHibernateTemplate().get(CourseType.class, courseTypeId);
	}

	@Override
	public Integer save(CourseType courseType) {
		return (Integer) getHibernateTemplate().save(courseType);
	}

	@Override
	public void update(CourseType courseType) {
		getHibernateTemplate().update(courseType);

	}

	@Override
	public void delete(CourseType courseType) {
		getHibernateTemplate().delete(courseType);

	}

	@Override
	public void delete(Integer courseTypeId) {
		getHibernateTemplate().delete(get(courseTypeId));

	}

	@Override
	public List<CourseType> findAll() {
		return (List<CourseType>) getHibernateTemplate().find(
				"from CourseType ");
	}


	@Override
	public List<CourseType> findAll(int offset, int pageSize) {
		return this.findByPage("from CourseType ", offset, pageSize);
	}

	@Override
	public int getTotalCourseTypeCounts() {
		int counts=findAll().size();
		System.out.println("total courseType counts="+counts);
		return counts;
	}
}

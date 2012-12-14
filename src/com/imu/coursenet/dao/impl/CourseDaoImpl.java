package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Admin;
import com.imu.coursenet.domain.Course;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseDaoImpl extends YeekuHibernateDaoSupport implements
		CourseDao {

	@Override
	public Course get(Integer courseId) {
		return getHibernateTemplate().get(Course.class, courseId);
	}

	@Override
	public Integer save(Course course) {
		return (Integer) getHibernateTemplate().save(course);
	}

	@Override
	public void update(Course course) {
		getHibernateTemplate().update(course);

	}

	@Override
	public void delete(Course course) {
		getHibernateTemplate().delete(course);

	}

	@Override
	public void delete(Integer courseId) {
		getHibernateTemplate().delete(get(courseId));

	}

	@Override
	public List<Course> findAll() {
		return (List<Course>) getHibernateTemplate().find("from Course ");
	}


	@Override
	public List<Course> findAll(int offset, int pageSize) {
		return this.findByPage("from Course ", offset, pageSize);
	}

	@Override
	public int getTotalCourseCounts() {
		int counts=findAll().size();
		System.out.println("total course counts="+counts);
		return counts;
	}
}

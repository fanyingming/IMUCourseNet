package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class CourseDetailDaoImpl 
	extends YeekuHibernateDaoSupport 
	implements CourseDetailDao
{

	@Override
	public CourseDetail get(Integer courseDetailId) {
		return getHibernateTemplate()
				.get(CourseDetail.class , courseDetailId);
	}

	@Override
	public Integer save(CourseDetail courseDetail) {
		return (Integer)getHibernateTemplate()
				.save(courseDetail);
	}

	@Override
	public void update(CourseDetail courseDetail) {
		getHibernateTemplate()
		.update(courseDetail);
		
	}

	@Override
	public void delete(CourseDetail courseDetail) {
		getHibernateTemplate()
		.delete(courseDetail);
		
	}

	@Override
	public void delete(Integer courseDetailId) {
		getHibernateTemplate()
		.delete(get(courseDetailId));
		
	}

	@Override
	public List<CourseDetail> findAll() {
		return (List<CourseDetail>)getHibernateTemplate()
				.find("from CourseDetail ");
	}

	

}

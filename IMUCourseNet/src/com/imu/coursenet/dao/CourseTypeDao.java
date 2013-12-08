package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseTypeDao {
	CourseType get(Integer courseTypeId);

	Integer save(CourseType courseType);

	void update(CourseType courseType);

	void delete(CourseType courseType);

	void delete(Integer courseTypeId);

	List<CourseType> findAll();
	
	int getTotalCourseTypeCounts();
	
	List<CourseType> findAll(int offset,int pageSize);
}

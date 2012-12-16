package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseWorkDao {
	CourseWork get(Integer courseWorkId);

	Integer save(CourseWork courseWork);

	void update(CourseWork courseWork);

	void delete(CourseWork courseWork);

	void delete(Integer courseWorkId);

	List<CourseWork> findAll();

	List<CourseWork> findByCourseWorkRequirementId(
			Integer courseWorkRequirementId);
	
	List<CourseWork> findByCourseWorkRequirementIdAndUserId(
			Integer courseWorkRequirementId,Integer userId);
	
	List<CourseWork> findByUserId(Integer userId);
	
	List<CourseWork> findByCourseWorkId(Integer courseWorkId);
}

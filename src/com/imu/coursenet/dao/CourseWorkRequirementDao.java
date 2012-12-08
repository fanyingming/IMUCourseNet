package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseWorkRequirementDao {
	CourseWorkRequirement get(Integer courseWorkRequirementId);

	Integer save(CourseWorkRequirement courseWorkRequirement);

	void update(CourseWorkRequirement courseWorkRequirement);

	void delete(CourseWorkRequirement courseWorkRequirement);

	void delete(Integer courseWorkRequirementId);

	List<CourseWorkRequirement> findAll();

	List<CourseWorkRequirement> findByCourseDetailId(Integer courseDetailId);
}

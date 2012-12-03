package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseDao {
	Course get(Integer courseId);

	Integer save(Course course);

	void update(Course course);

	void delete(Course course);

	void delete(Integer courseId);

	List<Course> findAll();
}

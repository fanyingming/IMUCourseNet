package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseDetailDao {
	CourseDetail get(Integer courseDetailId);

	Integer save(CourseDetail courseDetail);

	void update(CourseDetail courseDetail);

	void delete(CourseDetail courseDetail);

	void delete(Integer courseDetailId);

	List<CourseDetail> findAll();
	
	List<CourseDetail> findByTeacherId(int teacherId,final int offset, final int pageSize);
}

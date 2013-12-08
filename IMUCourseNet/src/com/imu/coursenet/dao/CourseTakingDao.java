package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseTakingDao {
	CourseTaking get(Integer courseTakingId);

	Integer save(CourseTaking courseTaking);

	void update(CourseTaking courseTaking);

	void delete(CourseTaking courseTaking);

	void delete(Integer courseTakingId);

	List<CourseTaking> findAll();

	List<CourseTaking> findByStudentId(Integer studentId, int offset,
			int pageSize);

	List<CourseTaking> findAllByStudentId(int studentId);

	int getTotalCourseTakingCounts();

	List<CourseTaking> findAll(int offset, int pageSize);
}

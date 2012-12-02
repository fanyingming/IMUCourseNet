package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CoursewareDao {
	Courseware get(Integer coursewareId);

	Integer save(Courseware courseware);

	void update(Courseware courseware);

	void delete(Courseware courseware);

	void delete(Integer coursewareId);

	List<Courseware> findAll();
}

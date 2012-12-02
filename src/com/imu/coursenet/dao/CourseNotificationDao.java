package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseNotificationDao {
	CourseNotification get(Integer courseNotificationId);

	Integer save(CourseNotification courseNotification);

	void update(CourseNotification courseNotification);

	void delete(CourseNotification courseNotification);

	void delete(Integer courseNotificationId);

	List<CourseNotification> findAll();
}

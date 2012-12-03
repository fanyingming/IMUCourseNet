package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseNotificationManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<CourseNotification> listAllCourseNotification();

	int addCourseNotification(CourseNotification courseNotification,
			int courseDetailId);

	int deleteCourseNotification(int courseNotificationId);

	int updateCourseNotification(CourseNotification courseNotification);

	Course getCourseNotification(int courseNotificationId);
}

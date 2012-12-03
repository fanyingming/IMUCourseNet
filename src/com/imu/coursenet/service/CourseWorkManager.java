package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseWorkManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<CourseWork> listAllCourseWork();

	int addCourseWork(CourseWork courseWork, int courseDetailId);

	int deleteCourseWork(int courseWorkId);

	int updateCourseWork(CourseWork courseWork);

	Course getCourseWork(int courseWorkId);
}

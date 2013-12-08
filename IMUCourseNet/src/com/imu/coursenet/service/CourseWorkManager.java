package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseWorkManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<CourseWork> listAllCourseWork();

	List<CourseWork> listByCourseWorkRequirementId(
			Integer courseWorkRequirementId);

	int addCourseWork(String saveLocation, String title, Integer studentId,
			Integer courseWorkRequirementId);

	int deleteCourseWork(int courseWorkId);

	int updateCourseWork(CourseWork courseWork);

	CourseWork getCourseWork(int courseWorkId);
	
	List<CourseWork> getCourseWorkByCourseWorkRequirementIdAndUserId(int courseWorkRequirementId,int userId);
	List<CourseWork> getCourseWorkByUserId(Integer userId);
	List<CourseWork> getCourseWorkByCourseWorkId(Integer courseWorkId);
}

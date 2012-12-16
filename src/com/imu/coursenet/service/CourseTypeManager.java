package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseTypeManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<CourseType> listAllCourseType();

	int addCourseType(CourseType courseType);

	int deleteCourseType(int courseTypeId);

	int updateCourseType(CourseType courseType);

	CourseType getCourseType(int courseTypeId);
	

	List<CourseType> listAllCourseType(int offset,int pageSize);

	int totalCourseTypeCounts();
}

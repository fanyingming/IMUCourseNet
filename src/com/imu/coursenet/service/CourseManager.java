package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Course> listAllCourse();

	int addCourse(Course course, int departmentId, int courseTypeId);

	int deleteCourse(int courseId);

	int updateCourse(Course course);

	Course getCourse(int courseId);
	
	List<Course> listAllCourse(int offset,int pageSize);

	int totalCourseCounts();
}

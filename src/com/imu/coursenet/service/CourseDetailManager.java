package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseDetailManager {
	public static final int OP_SUCC=1;
	public static final int OP_FAIL=-1;
	
	List<CourseDetail> listAllCourseDetail();
	int addCourseDetail(int teacherId,int courseId);
	int deleteCourseDetail(int courseDetailId);
	int updateCourseDetail(CourseDetail courseDetail);
	Course getCourseDetail(int courseDetailId);
}

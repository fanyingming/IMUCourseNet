package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CoursewareManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Courseware> listAllCourseware();

	List<Courseware> listAllCoursewareByCourseDetailId(Integer courseDetailId);

	int addCourseware(String savaLocation, String title, int courseDetailId);

	int deleteCourseware(int coursewareId);

	int updateCourseware(Courseware courseware);

	Courseware getCourseware(int coursewareId);

}

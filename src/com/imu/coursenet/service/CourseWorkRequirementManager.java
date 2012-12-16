package com.imu.coursenet.service;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseWorkRequirementManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<CourseWorkRequirement> listAllCourseWorkRequirement();

	List<CourseWorkRequirement> listCourseWorkRequirementByCourseDetailId(
			Integer courseDetailId);

	int addCourseWorkRequirement(int courseWorkRequirementId, String title,
			String requirementContent, Date deadLine);

	int deleteCourseWorkRequirement(int courseWorkRequirementId);

	int updateCourseWorkRequirement(CourseWorkRequirement courseWorkRequirement);

	CourseWorkRequirement getCourseWorkRequirement(int courseWorkRequirementId);
}

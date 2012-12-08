package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseTakingManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<CourseTaking> listAllCourseTaking();

	List<CourseTaking> listCourseTakingByStudentId(int studentId,
			final int offset, final int pageSize);

	List<CourseTaking> listAllCourseTakingByStudentId(int studentId);

	int addCourseTaking(int courseDetailId, int studentId);

	int deleteCourseTaking(int courseTakingId);

	int updateCourseTaking(CourseTaking courseTaking);

	CourseTaking getCourseTaking(int courseTakingId);
}

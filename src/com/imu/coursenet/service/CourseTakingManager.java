package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface CourseTakingManager {
	public static final int OP_SUCC=1;
	public static final int OP_FAIL=-1;
	
	List<CourseTaking> listAllCourseTaking();
	int addCourseTaking(CourseTaking courseTaking,int courseDetailId,int studentId);
	int deleteCourseTaking(int courseTakingId);
	int updateCourseTaking(CourseTaking courseTaking);
	Course getCourseTaking(int courseTakingId);
}

package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface SpecialtyManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Specialty> listAllSpecialty();

	int addSpecialty(Specialty specialty, int departmentId);

	int deleteSpecialty(int specialtyId);

	int updateSpecialty(Specialty specialty);

	Specialty getSpecialty(int specialtyId);
}

package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.Specialty;
import com.imu.coursenet.domain.Student;

public interface SpecialtyDao {
	Specialty get(Integer specialtyId);

	Integer save(Specialty specialty);

	void update(Specialty specialty);

	void delete(Specialty specialty);

	void delete(Integer specialtyId);

	List<Specialty> findAll();

	List<Specialty> findAll(int offset,int pageSize);
	
	int getTotalSpecialtyCounts();
}

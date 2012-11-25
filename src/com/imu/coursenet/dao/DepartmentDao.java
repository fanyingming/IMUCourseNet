package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface DepartmentDao {
	Department get(Integer departmentId);

	Integer save(Department department);

	void update(Department department);

	void delete(Department department);

	void delete(Integer departmentId);

	List<Department> findAll();
}

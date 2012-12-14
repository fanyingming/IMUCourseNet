package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface DepartmentManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Department> listAllDepartment();

	int addDepartment(Department department);

	int deleteDepartment(int departmentId);

	int updateDepartment(Department department);

	Department getDepartment(int departmentId);
	
	List<Department> listAllDepartment(int offset,int pageSize);

	int totalDepartmentCounts();
}

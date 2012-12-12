package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.Admin;

public interface AdminDao {

	Admin get(Integer userId);

	Integer save(Admin admin);

	void update(Admin admin);

	void delete(Admin admin);

	void delete(Integer userId);

	List<Admin> findAll();

	List<Admin> findAll(int offset,int pageSize);
	
	List<Admin> getAdmin(int userId);

	List<Admin> findByAccountAndPass(String userAccount, String userPass);
	int getTotalAdminCounts();
}

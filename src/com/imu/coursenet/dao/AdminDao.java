package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.Admin;

public interface AdminDao {
	
	Admin get(Integer id);

	Integer save(Admin admin);

	void update(Admin admin);

	void delete(Admin admin);

	void delete(Integer id);

	List<Admin> findAll();
	
	List<Admin> findByAccountAndPass(String userAccount,String userPass);
}

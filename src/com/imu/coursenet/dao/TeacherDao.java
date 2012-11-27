package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface TeacherDao {

	Teacher get(Integer userId);

	Integer save(Teacher teacher);

	void update(Teacher teacher);

	void delete(Teacher teacher);

	void delete(Integer userId);

	List<Teacher> findAll();
	List<Teacher> getTeacher(int userId);
	List<Teacher> findByAccountAndPass(String userAccount,String userPass);
}

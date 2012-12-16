package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface StudentDao {

	Student get(Integer userId);

	Integer save(Student student);

	void update(Student student);

	void delete(Student student);

	void delete(Integer userId);

	List<Student> findAll();

	List<Student> getStudent(int userId);

	List<Student> findByAccountAndPass(String userAccount, String userPass);

	List<Student> findAll(int offset,int pageSize);
	
	int getTotalStudentCounts();
}

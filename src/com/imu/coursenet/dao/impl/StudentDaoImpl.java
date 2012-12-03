package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Admin;
import com.imu.coursenet.domain.Student;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class StudentDaoImpl extends YeekuHibernateDaoSupport implements
		StudentDao {

	@Override
	public Student get(Integer userId) {
		return getHibernateTemplate().get(Student.class, userId);
	}

	@Override
	public Integer save(Student student) {
		return (Integer) getHibernateTemplate().save(student);
	}

	@Override
	public void update(Student student) {
		getHibernateTemplate().update(student);

	}

	@Override
	public void delete(Student student) {
		getHibernateTemplate().delete(student);

	}

	@Override
	public void delete(Integer userId) {
		getHibernateTemplate().delete(get(userId));

	}

	@Override
	public List<Student> findAll() {
		return (List<Student>) getHibernateTemplate().find("from Student");
	}

	@Override
	public List<Student> findByAccountAndPass(String userAccount,
			String userPass) {
		return (List<Student>) getHibernateTemplate().find(
				"from Student s where s.userAccount = ? and s.userPass=?",
				userAccount, userPass);
	}

	@Override
	public List<Student> getStudent(int userId) {
		return (List<Student>) getHibernateTemplate().find(
				"from Student a where a.userId = ?", userId);
	}

}

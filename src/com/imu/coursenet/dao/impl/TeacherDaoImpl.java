package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Admin;
import com.imu.coursenet.domain.Student;
import com.imu.coursenet.domain.Teacher;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class TeacherDaoImpl extends YeekuHibernateDaoSupport implements
		TeacherDao {

	@Override
	public List<Teacher> findAll(int offset, int pageSize) {
		// TODO Auto-generated method stub
		return this.findByPage("from Teacher ", offset, pageSize);
	}

	@Override
	public Teacher get(Integer userId) {
		return getHibernateTemplate().get(Teacher.class, userId);
	}

	@Override
	public Integer save(Teacher teacher) {
		return (Integer) getHibernateTemplate().save(teacher);
	}

	@Override
	public void update(Teacher teacher) {
		getHibernateTemplate().update(teacher);

	}

	@Override
	public void delete(Teacher teacher) {
		getHibernateTemplate().delete(teacher);

	}

	@Override
	public void delete(Integer userId) {
		getHibernateTemplate().delete(get(userId));

	}

	@Override
	public List<Teacher> findAll() {
		return (List<Teacher>) getHibernateTemplate().find("from Teacher");
	}

	@Override
	public List<Teacher> findByAccountAndPass(String userAccount,
			String userPass) {
		return (List<Teacher>) getHibernateTemplate().find(
				"from Teacher t where t.userAccount = ? and t.userPass=?",
				userAccount, userPass);
	}

	@Override
	public List<Teacher> getTeacher(int userId) {
		return (List<Teacher>) getHibernateTemplate().find(
				"from Teacher a where a.userId = ?", userId);
	}

	@Override
	public int getTotalTeacherCounts() {
		int counts=findAll().size();
		System.out.println("total teacher counts="+counts);
		return counts;
	}
}

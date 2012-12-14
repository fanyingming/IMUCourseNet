package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Department;
import com.imu.coursenet.domain.Specialty;
import com.imu.coursenet.domain.Student;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class SpecialtyDaoImpl extends YeekuHibernateDaoSupport implements
		SpecialtyDao {

	@Override
	public Specialty get(Integer specialtyId) {
		return getHibernateTemplate().get(Specialty.class, specialtyId);
	}

	@Override
	public Integer save(Specialty specialty) {
		return (Integer) getHibernateTemplate().save(specialty);
	}

	@Override
	public void update(Specialty specialty) {
		getHibernateTemplate().update(specialty);

	}

	@Override
	public void delete(Specialty specialty) {
		getHibernateTemplate().delete(specialty);

	}

	@Override
	public void delete(Integer specialtyId) {
		getHibernateTemplate().delete(get(specialtyId));

	}

	@Override
	public List<Specialty> findAll() {
		return (List<Specialty>) getHibernateTemplate().find("from Specialty ");
	}

	@Override
	public List<Specialty> findAll(int offset, int pageSize) {
		// TODO Auto-generated method stub
		return this.findByPage("from Specialty ", offset, pageSize);
	}
	

	@Override
	public int getTotalSpecialtyCounts() {
		int counts=findAll().size();
		System.out.println("total specialty counts="+counts);
		return counts;
	}
}

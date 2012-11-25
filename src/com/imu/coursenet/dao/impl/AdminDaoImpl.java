package com.imu.coursenet.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.imu.coursenet.dao.AdminDao;
import com.imu.coursenet.domain.Admin;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class AdminDaoImpl 
	extends YeekuHibernateDaoSupport 
	implements AdminDao
{

	@Override
	public Admin get(Integer userId) {
		return getHibernateTemplate()
				.get(Admin.class , userId);
	}

	@Override
	public Integer save(Admin admin) {
		return (Integer)getHibernateTemplate()
				.save(admin);
	}

	@Override
	public void update(Admin admin) {
		getHibernateTemplate()
		.update(admin);
		
	}

	@Override
	public void delete(Admin admin) {
		getHibernateTemplate()
		.delete(admin);
		
	}

	@Override
	public void delete(Integer userId) {
		getHibernateTemplate()
		.delete(get(userId));
		
	}

	@Override
	public List<Admin> findAll() {
		return (List<Admin>)getHibernateTemplate()
				.find("from Admin ");
	}
	
	@Override
	public List<Admin> findByAccountAndPass(String userAccount,String userPass)
	{
		return (List<Admin>)getHibernateTemplate()
			.find("from Admin a where a.userAccount = ? and a.userPass=?"
			,userAccount , userPass); 
	}

}

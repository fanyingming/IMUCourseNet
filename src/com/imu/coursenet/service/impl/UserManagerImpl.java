package com.imu.coursenet.service.impl;
import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class UserManagerImpl implements UserManager{

	private AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	@Override
	public int validLogin(String userAccount,String userPass) {
		if (adminDao.findByAccountAndPass(userAccount,userPass).size()==1)
			{
				return LOGIN_ADMIN ;
			}
		else
			return LOGIN_FAIL;
	}

}

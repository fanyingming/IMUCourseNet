package com.imu.coursenet.service.impl;
import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class UserManagerImpl implements UserManager{
	private AdminDao adminDao;
	
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


	@Override
	public int validLogin(String userAccount,String userPass) {
		if(userAccount.length()==0 || userPass.length()==0) 
			return this.LOGIN_FAIL;
		else if(adminDao.findByAccountAndPass(userAccount, userPass).size()==1)
				return LOGIN_ADMIN ;
		else
			return this.LOGIN_FAIL;
	}

}

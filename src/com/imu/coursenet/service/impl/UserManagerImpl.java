package com.imu.coursenet.service.impl;
import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class UserManagerImpl implements UserManager{

	
	@Override
	public int validLogin(String userAccount,String userPass) {
		
		return LOGIN_ADMIN ;
	}

}

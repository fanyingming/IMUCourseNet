package com.imu.coursenet.service;

import com.imu.coursenet.domain.Admin;

public interface UserManager {
	//��¼ʧ��
		public static final int LOGIN_FAIL = 0;
		
		public static final int LOGIN_ADMIN = 1;
		
		public static final int LOGIN_TEACHER = 2;
		
		public static final int LOGIN_STUDENT = 3;
		
		
		
		int validLogin(String userAccount,String userPass);
}

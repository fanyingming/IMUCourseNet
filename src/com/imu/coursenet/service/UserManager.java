package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;



public interface UserManager {
	
		public static final int LOGIN_FAIL = 0;
		
		public static final int LOGIN_ADMIN = 1;
		
		public static final int LOGIN_TEACHER = 2;
		
		public static final int LOGIN_STUDENT = 3;
		
		
		
		int validLogin(String userAccount,String userPass);
		List<Admin> listAllAdmin();
		List<Teacher> listAllTeacher();
		List<Student> listAllStudent();
}

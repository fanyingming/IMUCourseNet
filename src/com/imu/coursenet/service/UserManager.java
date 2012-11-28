package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;



public interface UserManager {
	
		public static final int LOGIN_FAIL = 0;
		
		public static final int LOGIN_ADMIN = 1;
		
		public static final int LOGIN_TEACHER = 2;
		
		public static final int LOGIN_STUDENT = 3;
		
		public static final int ADMIN=1;
		public static final int TEACHER=2;
		public static final int STUDENT=3;
		
		public static final int OP_SUCC=1;
		public static final int OP_FAIL=-1;
		/*
		 * 
		 */
		
		/*-------------User------------------*/
		int validLogin(String userAccount,String userPass);
		int deleteUser(int userId);
		int getUserType(int userId);
		/*------------Admin------------------*/
		Admin getAdminById(int userId);
		List<Admin> listAllAdmin();
		int addAdmin(Admin admin,int departmentId);
		int updateAdmin(Admin admin);
		/*-----------Teacher-----------------*/
		Teacher getTeacherById(int userId);
		List<Teacher> listAllTeacher();
		int addTeacher(Teacher teacher,int departmentId);
		int updateTeacher(Teacher teacher);
		/*-----------Student-----------------*/
		Student getStudentById(int userId);
		List<Student> listAllStudent();
		int addStudent(Student student,int departmentId);
		int updateStudent(Student student);
		
		
}

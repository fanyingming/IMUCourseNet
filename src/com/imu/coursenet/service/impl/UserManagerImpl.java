package com.imu.coursenet.service.impl;
import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class UserManagerImpl implements UserManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public int validLogin(String userAccount,String userPass) {
		//¬ÀµÙ’À∫≈ªÚ√‹¬ÎŒ™ø’µƒ ‰»Î
		if(userAccount.length()==0 || userPass.length()==0) 
			return this.LOGIN_FAIL;
		else if(adminDao.findByAccountAndPass(userAccount, userPass).size()==1)
				return LOGIN_ADMIN ;
		else if(teacherDao.findByAccountAndPass(userAccount, userPass).size()==1)
			return LOGIN_TEACHER ;
		else if(studentDao.findByAccountAndPass(userAccount, userPass).size()==1)
			return LOGIN_STUDENT ;
		else
			return this.LOGIN_FAIL;
	}

}

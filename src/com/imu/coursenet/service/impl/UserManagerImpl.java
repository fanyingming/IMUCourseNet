package com.imu.coursenet.service.impl;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class UserManagerImpl implements UserManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	private DepartmentDao departmentDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}


	@Override
	public int validLogin(String userAccount,String userPass) {
		
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


	@Override
	public List<Admin> listAllAdmin() {
		return adminDao.findAll();
		
	}


	@Override
	public List<Teacher> listAllTeacher() {
		return teacherDao.findAll();
	}


	@Override
	public List<Student> listAllStudent() {
		return studentDao.findAll();
	}


	@Override
	public int deleteUser(int userId) {
		if(studentDao.get(userId)!=null)
			studentDao.delete(userId);
		else if(teacherDao.get(userId)!=null)
			teacherDao.delete(userId);
		else if(adminDao.get(userId)!=null)
			adminDao.delete(userId);
		return this.OP_SUCC;
	}


	@Override
	public int addAdmin(Admin admin,int departmentId) {
		Department department = departmentDao.get(departmentId);
		if(department == null)
			return this.OP_FAIL;
		admin.setDepartment(department);
		adminDao.save(admin);
		return this.OP_SUCC;
	}


	@Override
	public int updateAdmin(Admin admin) {
		adminDao.update(admin);
		return this.OP_SUCC;
	}


	@Override
	public int addTeacher(Teacher teacher) {
		teacherDao.save(teacher);
		return this.OP_SUCC;
	}


	@Override
	public int updateTeacher(Teacher teacher) {
		teacherDao.update(teacher);
		return this.OP_SUCC;
	}


	@Override
	public int addStudent(Student student) {
		studentDao.save(student);
		return this.OP_SUCC;
	}


	@Override
	public int updateStudent(Student student) {
		studentDao.update(student);
		return this.OP_SUCC;
	}
	
	

}

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
	private SpecialtyDao specialtyDao;
	
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


	public void setSpecialtyDao(SpecialtyDao specialtyDao) {
		this.specialtyDao = specialtyDao;
	}


	@Override
	public int validLogin(String userAccount,String userPass) {
		
		if(userAccount.length()==0 || userPass.length()==0) {
			return this.LOGIN_FAIL;
		}
		else if(adminDao.findByAccountAndPass(userAccount, userPass).size()==1){
			System.out.println("登陆，查找管理员表，找到");
			return LOGIN_ADMIN ;
				
		}
		else if(teacherDao.findByAccountAndPass(userAccount, userPass).size()==1){
			return LOGIN_TEACHER ;
		}
		else if(studentDao.findByAccountAndPass(userAccount, userPass).size()==1){
			return LOGIN_STUDENT ;
		}
		else{
			return this.LOGIN_FAIL;
		}
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
	public Admin getAdminById(int userId) {
		return adminDao.get(userId);
	}


	@Override
	public Teacher getTeacherById(int userId) {
		return teacherDao.get(userId);
	}


	@Override
	public Student getStudentById(int userId) {
		return studentDao.get(userId);
	}


	@Override
	public int deleteUser(int userId) {
		if(this.getUserType(userId)==this.STUDENT){
			studentDao.delete(userId);
			return this.STUDENT;
		}
		else if(this.getUserType(userId)==this.TEACHER){
			teacherDao.delete(userId);
			return this.TEACHER;
		}
		else if(this.getUserType(userId)==this.ADMIN){
			adminDao.delete(userId);
			return this.ADMIN;
		}
		return this.OP_FAIL;
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
	public int addTeacher(Teacher teacher,int departmentId) {
		Department department = departmentDao.get(departmentId);
		if(department == null)
			return this.OP_FAIL;
		teacher.setDepartment(department);
		teacherDao.save(teacher);
		return this.OP_SUCC;
	}


	@Override
	public int updateTeacher(Teacher teacher) {
		teacherDao.update(teacher);
		return this.OP_SUCC;
	}


	@Override
	public int addStudent(Student student,int departmentId) {
		Department department = departmentDao.get(departmentId);
		if(department == null)
			return this.OP_FAIL;
		student.setDepartment(department);
		studentDao.save(student);
		return this.OP_SUCC;
	}


	@Override
	public int updateStudent(Student student) {
		studentDao.update(student);
		return this.OP_SUCC;
	}


	@Override
	public int getUserType(int userId) {
		if(adminDao.getAdmin(userId).size()==1){
			return this.ADMIN;
		}else if(teacherDao.getTeacher(userId).size()==1){
			return this.TEACHER;
		}else if(studentDao.getStudent(userId).size()==1){
			return this.STUDENT;
		}
		return this.OP_FAIL;
	}
	
	
	

}

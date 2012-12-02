package com.imu.coursenet.service.impl;

import java.util.List;

import com.imu.coursenet.dao.AdminDao;
import com.imu.coursenet.dao.CourseDao;
import com.imu.coursenet.dao.CourseDetailDao;
import com.imu.coursenet.dao.CourseNotificationDao;
import com.imu.coursenet.dao.CourseTakingDao;
import com.imu.coursenet.dao.CourseTypeDao;
import com.imu.coursenet.dao.CourseWorkDao;
import com.imu.coursenet.dao.CoursewareDao;
import com.imu.coursenet.dao.DepartmentDao;
import com.imu.coursenet.dao.LetterDao;
import com.imu.coursenet.dao.MessageDao;
import com.imu.coursenet.dao.PostDao;
import com.imu.coursenet.dao.PostReplyDao;
import com.imu.coursenet.dao.SpecialtyDao;
import com.imu.coursenet.dao.StudentDao;
import com.imu.coursenet.dao.TeacherDao;
import com.imu.coursenet.domain.Course;
import com.imu.coursenet.domain.CourseWork;
import com.imu.coursenet.service.*;

public class CourseWorkManagerImpl implements CourseWorkManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	private DepartmentDao departmentDao;
	private SpecialtyDao specialtyDao;
	private CourseDao courseDao;
	private CourseTypeDao courseTypeDao;
	private CourseDetailDao courseDetailDao;
	private CoursewareDao coursewareDao;
	private CourseWorkDao courseWorkDao;
	private CourseTakingDao courseTakingDao;
	private CourseNotificationDao courseNotificationDao;
	private LetterDao letterDao;
	private MessageDao messageDao;
	private PostDao postDao;
	private PostReplyDao postReplyDao;
	@Override
	public List<CourseWork> listAllCourseWork() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int addCourseWork(CourseWork courseWork, int courseDetailId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteCourseWork(int courseWorkId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateCourseWork(CourseWork courseWork) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Course getCourseWork(int courseWorkId) {
		// TODO Auto-generated method stub
		return null;
	}
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
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}
	public void setCourseDetailDao(CourseDetailDao courseDetailDao) {
		this.courseDetailDao = courseDetailDao;
	}
	public void setCoursewareDao(CoursewareDao coursewareDao) {
		this.coursewareDao = coursewareDao;
	}
	public void setCourseWorkDao(CourseWorkDao courseWorkDao) {
		this.courseWorkDao = courseWorkDao;
	}
	public void setCourseTakingDao(CourseTakingDao courseTakingDao) {
		this.courseTakingDao = courseTakingDao;
	}
	public void setCourseNotificationDao(CourseNotificationDao courseNotificationDao) {
		this.courseNotificationDao = courseNotificationDao;
	}
	public void setLetterDao(LetterDao letterDao) {
		this.letterDao = letterDao;
	}
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	public void setPostReplyDao(PostReplyDao postReplyDao) {
		this.postReplyDao = postReplyDao;
	}
	
	
}

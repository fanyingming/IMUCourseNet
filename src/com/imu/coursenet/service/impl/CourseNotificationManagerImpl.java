package com.imu.coursenet.service.impl;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Course;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.CourseNotification;
import com.imu.coursenet.service.*;

public class CourseNotificationManagerImpl implements CourseNotificationManager {
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
	private CourseWorkRequirementDao courseWorkRequirementDao;

	@Override
	public List<CourseNotification> listAllCourseNotification() {
		// TODO Auto-generated method stub
		return courseNotificationDao.findAll();
	}

	@Override
	public List<CourseNotification> listCourseNotificationByCourseDetailId(
			Integer courseDetailId) {
		return courseNotificationDao.findByCourseDetailId(courseDetailId);
	}

	@Override
	public int addCourseNotification(int courseDetailId, String title,
			String content) {
		CourseDetail courseDetail = courseDetailDao.get(courseDetailId);
		CourseNotification courseNotification = new CourseNotification(
				courseDetail, title, content, new Date(), 0);
		courseNotificationDao.save(courseNotification);
		return this.OP_SUCC;
	}

	@Override
	public int deleteCourseNotification(int courseNotificationId) {

		courseNotificationDao.delete(courseNotificationId);
		return this.OP_SUCC;
	}

	@Override
	public int updateCourseNotification(CourseNotification courseNotification) {
		// TODO Auto-generated method stub
		return this.OP_SUCC;
	}

	@Override
	public Course getCourseNotification(int courseNotificationId) {
		// TODO Auto-generated method stub
		return courseDao.get(courseNotificationId);
		// return null;
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

	public void setCourseNotificationDao(
			CourseNotificationDao courseNotificationDao) {
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

	public void setCourseWorkRequirementDao(
			CourseWorkRequirementDao courseWorkRequirementDao) {
		this.courseWorkRequirementDao = courseWorkRequirementDao;
	}

}

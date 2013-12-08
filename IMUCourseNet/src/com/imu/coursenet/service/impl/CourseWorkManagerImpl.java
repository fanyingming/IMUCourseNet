package com.imu.coursenet.service.impl;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class CourseWorkManagerImpl implements CourseWorkManager {
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
	private NewsDao newsDao;
	private NoticeDao noticeDao;

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao=noticeDao;
	}
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	public void setCourseWorkRequirementDao(
			CourseWorkRequirementDao courseWorkRequirementDao) {
		this.courseWorkRequirementDao = courseWorkRequirementDao;
	}

	@Override
	public List<CourseWork> listAllCourseWork() {
		return courseWorkDao.findAll();

	}

	@Override
	public int addCourseWork(String saveLocation, String title,
			Integer studentId, Integer courseWorkRequirementId) {
		CourseWorkRequirement courseWorkRequirement = courseWorkRequirementDao
				.get(courseWorkRequirementId);
		Student student = studentDao.get(studentId);
		CourseWork courseWork = new CourseWork(saveLocation, title,
				courseWorkRequirement, student, new Date());
		courseWorkDao.save(courseWork);
		return this.OP_SUCC;
	}

	@Override
	public int deleteCourseWork(int courseWorkId) {
		courseWorkDao.delete(courseWorkId);
		return this.OP_SUCC;
	}

	@Override
	public int updateCourseWork(CourseWork courseWork) {
		courseWorkDao.update(courseWork);
		return this.OP_SUCC;
	}

	@Override
	public CourseWork getCourseWork(int courseWorkId) {
//		System.out.println("in CourseWorkManagerImpl,courseWorkId="+courseWorkId);
		return courseWorkDao.get(courseWorkId);
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

	@Override
	public List<CourseWork> listByCourseWorkRequirementId(
			Integer courseWorkRequirementId) {
		return courseWorkDao
				.findByCourseWorkRequirementId(courseWorkRequirementId);
	}
	@Override
	public List<CourseWork> getCourseWorkByCourseWorkRequirementIdAndUserId(
			int courseWorkRequirementId, int userId) {
		return courseWorkDao.findByCourseWorkRequirementIdAndUserId(courseWorkRequirementId, userId);
	}
	@Override
	public List<CourseWork> getCourseWorkByUserId(Integer userId) {
		
		return courseWorkDao.findByUserId(userId);
	}
	@Override
	public List<CourseWork> getCourseWorkByCourseWorkId(Integer courseWorkId) {
		System.out.println("in courseWorkManager,courseWorkId="+courseWorkId);
		
		return courseWorkDao.findByCourseWorkId(courseWorkId);
	}

}

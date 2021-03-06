package com.imu.coursenet.service.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;
import com.imu.coursenet.support.FileOperation;

public class CoursewareManagerImpl implements CoursewareManager {
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
	public List<Courseware> listAllCourseware() {

		return coursewareDao.findAll();
	}

	@Override
	public List<Courseware> listAllCoursewareByCourseDetailId(
			Integer courseDetailId) {
		return coursewareDao.findByCourseDetailId(courseDetailId);

	}

	@Override
	public int addCourseware(String savaLocation, String title,
			int courseDetailId) {
		CourseDetail courseDetail = courseDetailDao.get(courseDetailId);
		Date date = new Date();
		Courseware courseware = new Courseware(savaLocation, title, date,
				courseDetail);
		courseware.setDownloadCounts(0);
		coursewareDao.save(courseware);
		return this.OP_SUCC;
	}

	@Override
	public int deleteCourseware(int coursewareId) {
		/* 删除相应的实体文件 */
		Courseware courseware = coursewareDao.get(coursewareId);
		if (!FileOperation.deleteFile(courseware.getSaveLocation())) {
			return this.OP_FAIL;
		}
		coursewareDao.delete(coursewareId);

		return this.OP_SUCC;
	}

	@Override
	public int updateCourseware(Courseware courseware) {
		coursewareDao.update(courseware);
		return this.OP_SUCC;
	}

	@Override
	public Courseware getCourseware(int coursewareId) {
		return coursewareDao.get(coursewareId);
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

}

package com.imu.coursenet.service.impl;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;

import com.imu.coursenet.service.*;

public class CourseDetailManagerImpl implements CourseDetailManager {

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
	public List<CourseDetail> listAllCourseDetail() {
		return courseDetailDao.findAll();
	}

	@Override
	public int addCourseDetail(int teacherId, int courseId) {
		CourseDetail courseDetail = new CourseDetail();
		Teacher teacher = teacherDao.get(teacherId);
		Course course = courseDao.get(courseId);
		courseDetail.setTeacher(teacher);
		courseDetail.setCourse(course);
		Date date = new Date();
		courseDetail.setEstablishDate(date);
		courseDetail.setState(1);
		courseDetailDao.save(courseDetail);
		return this.OP_SUCC;
	}

	@Override
	public List<CourseDetail> listCourseDetailByTeacherId(int teacherId,
			final int offset, final int pageSize) {
		return courseDetailDao.findByTeacherId(teacherId, offset, pageSize);

	}

	@Override
	public int deleteCourseDetail(int courseDetailId) {
		courseDetailDao.delete(courseDetailId);
		return this.OP_SUCC;
	}

	@Override
	public int updateCourseDetail(CourseDetail courseDetail) {
		courseDetailDao.update(courseDetail);
		return this.OP_SUCC;
	}

	@Override
	public CourseDetail getCourseDetail(int courseDetailId) {
		return courseDetailDao.get(courseDetailId);

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
	public int getTotalCourseDetailCounts() {
		return courseDetailDao.getAllCourseDetailCounts();
	}
	@Override
	public List<CourseDetail> listCourseDetail(int offset, int pageSize) {
		
		return courseDetailDao.findAll(offset, pageSize);
	}
	@Override
	public List<CourseDetail> listCourseDetailByCourseId(int courseId) {
		return courseDetailDao.findByCourseId(courseId);
	}

}

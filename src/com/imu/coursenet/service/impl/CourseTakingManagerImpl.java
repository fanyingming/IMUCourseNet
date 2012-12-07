package com.imu.coursenet.service.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class CourseTakingManagerImpl implements CourseTakingManager {
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
	

	
	public void setCourseWorkRequirementDao(
			CourseWorkRequirementDao courseWorkRequirementDao) {
		this.courseWorkRequirementDao = courseWorkRequirementDao;
	}

	@Override
	public List<CourseTaking> listCourseTakingByStudentId(int studentId,
			int offset, int pageSize) {
		return courseTakingDao.findByStudentId(studentId, offset, pageSize);
	}

	@Override
	public List<CourseTaking> listAllCourseTaking() {
		return courseTakingDao.findAll();
	}

	@Override
	public int addCourseTaking(int courseDetailId, int studentId) {
		CourseDetail courseDetail = courseDetailDao.get(courseDetailId);
		Student student = studentDao.get(studentId);
		CourseTaking courseTaking = new CourseTaking(courseDetail, student);
		courseTakingDao.save(courseTaking);
		return this.OP_SUCC;
	}

	@Override
	public int deleteCourseTaking(int courseTakingId) {
		courseTakingDao.delete(courseTakingId);
		return this.OP_SUCC;
	}

	@Override
	public int updateCourseTaking(CourseTaking courseTaking) {
		courseTakingDao.update(courseTaking);
		return this.OP_SUCC;
	}

	@Override
	public CourseTaking getCourseTaking(int courseTakingId) {
		return courseTakingDao.get(courseTakingId);
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

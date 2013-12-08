package com.imu.coursenet.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;

import com.imu.coursenet.service.*;

public class MessageManagerImpl implements MessageManager {
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
	public List<Message> listAllMessage() {
		return messageDao.findAll();
	}

	@Override
	public List<Message> listAllMessage(int offset, int pageSize) {
		return messageDao.findAll(offset, pageSize);
	}
	@Override
	public int addMessage(String content, int userId) {
		Student student;
		Teacher teacher;
		Admin admin;
		Message message = new Message();
		message.setContent(content);
		Date date = new Date();
		message.setEditDate(date);
		if (studentDao.getStudent(userId).size() != 0) {
			student = studentDao.get(userId);
			message.setUser(student);
		} else if (teacherDao.getTeacher(userId).size() != 0){
			teacher = teacherDao.get(userId);
			message.setUser(teacher);
		}else{
			admin = adminDao.get(userId);
			message.setUser(admin);
		}
		messageDao.save(message);
		return this.OP_SUCC;
	}

	@Override
	public int deleteMessage(int messageId) {
		messageDao.delete(messageId);
		return this.OP_SUCC;
	}

	@Override
	public Message getMessage(int messageId) {
		return messageDao.get(messageId);
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
	public int getTotalMessageCounts() {
		return messageDao.getAllMessageCounts();
	}

}

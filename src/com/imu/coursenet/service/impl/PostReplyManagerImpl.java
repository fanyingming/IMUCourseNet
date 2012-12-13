package com.imu.coursenet.service.impl;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.Post;
import com.imu.coursenet.domain.PostReply;
import com.imu.coursenet.domain.Student;
import com.imu.coursenet.domain.Teacher;
import com.imu.coursenet.service.*;

public class PostReplyManagerImpl implements PostReplyManager {
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
	public int addPostReply(String content, int postId, int userId) {
		// TODO Auto-generated method stub
		Student student;
		Teacher teacher;
		Post post=postDao.get(postId);
		PostReply postreply=new  PostReply();
		postreply.setContent(content);
		Date date=new Date();
		postreply.setEditDate(date);
		postreply.setPost(post);
		if (studentDao.getStudent(userId).size() != 0) {
			student = studentDao.get(userId);
			postreply.setUser(student);
		} else {
			teacher = teacherDao.get(userId);
			postreply.setUser(teacher);
		}
		postReplyDao.save(postreply);
		return this.OP_SUCC;
		
	}

	@Override
	public int deletePostReply(int postReplyId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePostReply(PostReply postReply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PostReply getPostReply(int postReplyId) {
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
	public List<PostReply> findbyPostId(Integer postId) {
		// TODO Auto-generated method stub
		 return postReplyDao.findbyPostId(postId);
	}

	
    
}

package com.imu.coursenet.service.impl;

import java.util.Date;
import java.util.List;

import com.imu.coursenet.dao.AdminDao;
import com.imu.coursenet.dao.CourseDao;
import com.imu.coursenet.dao.CourseDetailDao;
import com.imu.coursenet.dao.CourseNotificationDao;
import com.imu.coursenet.dao.CourseTakingDao;
import com.imu.coursenet.dao.CourseTypeDao;
import com.imu.coursenet.dao.CourseWorkDao;
import com.imu.coursenet.dao.CourseWorkRequirementDao;
import com.imu.coursenet.dao.CoursewareDao;
import com.imu.coursenet.dao.DepartmentDao;
import com.imu.coursenet.dao.LetterDao;
import com.imu.coursenet.dao.MessageDao;
import com.imu.coursenet.dao.NewsDao;
import com.imu.coursenet.dao.NoticeDao;
import com.imu.coursenet.dao.PostDao;
import com.imu.coursenet.dao.PostReplyDao;
import com.imu.coursenet.dao.SpecialtyDao;
import com.imu.coursenet.dao.StudentDao;
import com.imu.coursenet.dao.TeacherDao;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class PostManagerImpl implements PostManager {
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
	public List<Post> listAllPost() {
		return null;
	}

	

	@Override
	public int deletePost(int postId) {
		postDao.delete(postId);
		return this.OP_SUCC;
	}

	@Override
	public int updatePost(Post post) {
		postDao.update(post);
		return this.OP_SUCC;
	}

	

	@Override
	public int addPost(int courseDetailId, int userId, String title, String content) {
		// TODO Auto-generated method stub
		Integer checkCounts=0;
		Integer replyCounts=0;
		Student student;
		Teacher teacher;
		CourseDetail courseDetail=courseDetailDao.get(courseDetailId);
		//	System.out.println("courseDetailId="+courseDetail.getCourseDetailId());
	    Course course=courseDetail.getCourse();
	    Post post=new Post();
	    post.setCourse(course);
	    post.setCheckCounts(checkCounts);
	    post.setReplyCounts(replyCounts);
	    post.setContent(content);
	    post.setTitle(title);
	    Date date=new Date();
	    post.setEditDate(date);
	    if (studentDao.getStudent(userId).size() != 0) {
			student = studentDao.get(userId);
			post.setUser(student);
		} else {
			teacher = teacherDao.get(userId);
			post.setUser(teacher);
		}
	    postDao.save(post);
		return this.OP_SUCC;
	}

	@Override
	public Post getPost(int postId) {
		// TODO Auto-generated method stub
		return postDao.get(postId);
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
	public List<Post> findAllByCourseDetailId(Integer courseDetailId) {
		CourseDetail courseDetail=courseDetailDao.get(courseDetailId);
	//	System.out.println("courseDetailId="+courseDetail.getCourseDetailId());
		Course course=courseDetail.getCourse();
	//	System.out.println("courseId="+course.getCourseId());
		return postDao.findAllByCourseId(course.getCourseId());
//		return null;
	}

	
	

}

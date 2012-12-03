package com.imu.coursenet.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.imu.coursenet.service.*;

public class ManagerBaseAction extends ActionSupport {
	protected UserManager userManager;
	protected DepartmentManager departmentManager;
	protected SpecialtyManager specialtyManager;
	protected CourseTypeManager courseTypeManager;
	protected CourseManager courseManager;
	protected CourseDetailManager courseDetailManager;
	protected CourseNotificationManager courseNotificationManager;
	protected CoursewareManager coursewareManager;
	protected CourseWorkManager courseWorkManager;
	protected CourseTakingManager courseTakingManager;
	protected PostManager postManager;
	protected PostReplyManager postReplyManager;
	protected LetterManager letterManager;
	protected MessageManager messageManager;

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}

	public void setSpecialtyManager(SpecialtyManager specialtyManager) {
		this.specialtyManager = specialtyManager;
	}

	public void setCourseTypeManager(CourseTypeManager courseTypeManager) {
		this.courseTypeManager = courseTypeManager;
	}

	public void setCourseManager(CourseManager courseManager) {
		this.courseManager = courseManager;
	}

	public void setCourseDetailManager(CourseDetailManager courseDetailManager) {
		this.courseDetailManager = courseDetailManager;
	}

	public void setCourseNotificationManager(
			CourseNotificationManager courseNotificationManager) {
		this.courseNotificationManager = courseNotificationManager;
	}

	public void setCoursewareManager(CoursewareManager coursewareManager) {
		this.coursewareManager = coursewareManager;
	}

	public void setCourseWorkManager(CourseWorkManager courseWorkManager) {
		this.courseWorkManager = courseWorkManager;
	}

	public void setCourseTakingManager(CourseTakingManager courseTakingManager) {
		this.courseTakingManager = courseTakingManager;
	}

	public void setPostManager(PostManager postManager) {
		this.postManager = postManager;
	}

	public void setPostReplyManager(PostReplyManager postReplyManager) {
		this.postReplyManager = postReplyManager;
	}

	public void setLetterManager(LetterManager letterManager) {
		this.letterManager = letterManager;
	}

	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

}

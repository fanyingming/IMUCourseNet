package com.imu.coursenet.action.admin;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.Course;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class DeleteCourseAction extends ManagerBaseAction {
	private int courseId;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String execute() throws Exception {
		
		if(courseDetailManager.listCourseDetailByCourseId(courseId).size()!=0){
			Course course=courseManager.getCourse(courseId);
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("tip", "课程 ：“"+course.getCourseName()+
					"”还有开课的课程，所以您不能删除，要想执行删除操作，请先删除课程相关的选课信息。");
			return ERROR;
		}
		int result = courseManager.deleteCourse(courseId);
		if (result == courseManager.OP_SUCC) {
			return SUCCESS;
		} else
			return ERROR;
	}

}

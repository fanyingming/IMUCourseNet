package com.imu.coursenet.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseWork;
import com.imu.coursenet.domain.Courseware;
import com.imu.coursenet.domain.User;
import com.opensymphony.xwork2.ActionContext;

public class DownloadCourseWorkAction extends ManagerBaseAction {
	private Integer courseWorkId;

	public Integer getCourseWorkId() {
		return courseWorkId;
	}

	public void setCourseWorkId(Integer courseWorkId) {
		this.courseWorkId = courseWorkId;
	}

	public String getDownloadChineseFileName()
			throws UnsupportedEncodingException {
		CourseWork courseWork = courseWorkManager.getCourseWork(courseWorkId);
		String downloadChineseFileName = courseWork.getTitle();

		downloadChineseFileName = new String(
				downloadChineseFileName.getBytes(), "ISO8859-1");
		return downloadChineseFileName;
	}
	//这个函数充当了一个权限检测拦截器，只有发布这个作业的老师和上传这个作业的同学可以下载.
	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		CourseWork courseWork=courseWorkManager.getCourseWork(courseWorkId);
		if(courseWork.getStudent().getUserId()==user.getUserId()
				||
				courseWork.getCourseWorkRequirement().getCourseDetail().getTeacher().getUserId()==user.getUserId()
				){
			return SUCCESS;
		}else
		{
			ctx.getSession().put("tip", "您无权下载该文件！");
			return ERROR;
		}
	
	}

	public InputStream getInputStream() throws Exception {
		CourseWork courseWork = courseWorkManager.getCourseWork(courseWorkId);
		return new FileInputStream(courseWork.getCourseWorkLocation());

	}

}

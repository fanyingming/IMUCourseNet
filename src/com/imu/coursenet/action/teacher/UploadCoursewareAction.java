package com.imu.coursenet.action.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.Course;
import com.imu.coursenet.support.FileOperation;
import com.opensymphony.xwork2.ActionContext;

public class UploadCoursewareAction extends ManagerBaseAction {
	private String title;

	private File upload;

	private String uploadContentType;

	private String uploadFileName;

	private String savePath;

	public void setSavePath(String value) {
		this.savePath = value;
	}

	private String getSavePath() throws Exception {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return (this.title);
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public File getUpload() {
		return (this.upload);
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadContentType() {
		return (this.uploadContentType);
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadFileName() {
		return (this.uploadFileName);
	}

	public String execute() throws Exception {
		title = getUploadFileName();

		/* 首先获取当前开设课程的编号 */
		ActionContext ctx = ActionContext.getContext();
		int courseDetailId = Integer.parseInt(ctx.getSession()
				.get("courseDetailId").toString());
		/* 然后通过开设课程的编号获得课程的所属部门、课程名称、课程类型 */
		Course course = courseDetailManager.getCourseDetail(courseDetailId)
				.getCourse();
		String courseName = course.getCourseName();
		String departmentName = course.getDepartment().getDepartmentName();
		String courseTypeName = course.getCourseType().getCourseTypeName();
		String teacherName = courseDetailManager
				.getCourseDetail(courseDetailId).getTeacher().getUserName();
		/* 获得要保存课件的目录 */
		String saveDir = getSavePath() + "\\" + departmentName + "\\"
				+ courseName + "_" + courseTypeName + "\\" + teacherName;
		String saveLocation = saveDir + "\\" + title;
		/* 先创建相应文件夹 */
		FileOperation.makeFolder(saveDir);
		/* 开始上传 */
		FileOutputStream fos = new FileOutputStream(saveLocation);
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		fos.close();
		/* 上传完保存到数据库 */
		if (coursewareManager
				.addCourseware(saveLocation, title, courseDetailId) == coursewareManager.OP_SUCC) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}

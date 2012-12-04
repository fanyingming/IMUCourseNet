package com.imu.coursenet.action.teacher;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

public class UploadCoursewareAction extends  ManagerBaseAction {

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
		title=getUploadFileName();
		String saveLocation=getSavePath() + "\\"+ getUploadFileName();
		FileOutputStream fos = new FileOutputStream(saveLocation);
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		fos.close();
		
		ActionContext ctx = ActionContext.getContext();
		int courseDetailId = Integer.parseInt(ctx.getSession()
				.get("courseDetailId").toString());
		if(coursewareManager.addCourseware(saveLocation,title, courseDetailId)==coursewareManager.OP_SUCC){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
}
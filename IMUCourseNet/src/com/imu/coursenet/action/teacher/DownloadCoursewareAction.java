package com.imu.coursenet.action.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.Courseware;

public class DownloadCoursewareAction extends ManagerBaseAction {

	private Integer coursewareId;

	public Integer getCoursewareId() {
		return coursewareId;
	}

	public void setCoursewareId(Integer coursewareId) {
		this.coursewareId = coursewareId;
	}

	public String getDownloadChineseFileName()
			throws UnsupportedEncodingException {
		Courseware courseware = coursewareManager.getCourseware(coursewareId);
		String downloadChineseFileName = courseware.getTitle();

		downloadChineseFileName = new String(
				downloadChineseFileName.getBytes(), "ISO8859-1");
		return downloadChineseFileName;
	}

	public InputStream getInputStream() throws Exception {
		Courseware courseware = coursewareManager.getCourseware(coursewareId);
		
		return new FileInputStream(courseware.getSaveLocation());

	}

	@Override
	public String execute() throws Exception {
		Courseware courseware = coursewareManager.getCourseware(coursewareId);
		File file=new File(courseware.getSaveLocation());
		if(!file.exists()){
			return ERROR;
		}
		return SUCCESS;
	}
	
}

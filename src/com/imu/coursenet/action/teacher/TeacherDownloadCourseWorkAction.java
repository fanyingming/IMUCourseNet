package com.imu.coursenet.action.teacher;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.imu.coursenet.action.base.ManagerBaseAction;
import com.imu.coursenet.domain.CourseWork;
import com.imu.coursenet.domain.Courseware;

public class TeacherDownloadCourseWorkAction extends  ManagerBaseAction{
	private Integer courseWorkId;

	public Integer getCourseWorkId() {
		return courseWorkId;
	}

	public void setCourseWorkId(Integer courseWorkId) {
		this.courseWorkId = courseWorkId;
	}

	public String getDownloadChineseFileName() throws UnsupportedEncodingException {
		CourseWork courseWork=courseWorkManager.getCourseWork(courseWorkId);
        String downloadChineseFileName = courseWork.getTitle();

        downloadChineseFileName = new String(downloadChineseFileName.getBytes(),"ISO8859-1");
        return downloadChineseFileName;
	}
	
	public InputStream getInputStream() throws Exception {
		CourseWork courseWork=courseWorkManager.getCourseWork(courseWorkId);
        return new FileInputStream(courseWork.getCourseWorkLocation());   
     
    }
	
}

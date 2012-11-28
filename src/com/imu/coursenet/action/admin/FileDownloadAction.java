package com.imu.coursenet.action.admin;

import java.io.InputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.*;


public class FileDownloadAction
	extends ActionSupport 
{
	
	private String inputPath;
	
	public void setInputPath(String value)
	{
		inputPath = value;
	}
	
	public InputStream getTargetFile() throws Exception 
	{
		
		return ServletActionContext.getServletContext()
			.getResourceAsStream(inputPath);
	}
}

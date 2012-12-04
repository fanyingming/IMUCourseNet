package com.imu.coursenet.support;

import java.io.File;

public class FileOperation {
	public static boolean makeFolder(String folderPath){
		File file=new File(folderPath);
		if(!file.exists()){
			if(!file.mkdirs()){
				return false;
			}
		}
		return true;
	}
}

package com.imu.coursenet.action.base;
import com.opensymphony.xwork2.ActionSupport;
import com.imu.coursenet.service.*;
public class UserManagerBaseAction extends ActionSupport {
	//������ҵ���߼����
		protected UserManager userManager;
		//����ע��ҵ���߼�����������setter����

		public void setUserManager(UserManager userManager) {
			this.userManager = userManager;
		}
		
}

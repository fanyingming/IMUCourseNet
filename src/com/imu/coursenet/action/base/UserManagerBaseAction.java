package com.imu.coursenet.action.base;
import com.opensymphony.xwork2.ActionSupport;
import com.imu.coursenet.service.*;
public class UserManagerBaseAction extends ActionSupport {
	//依赖的业务逻辑组件
		protected UserManager userManager;
		//依赖注入业务逻辑组件所必须的setter方法

		public void setUserManager(UserManager userManager) {
			this.userManager = userManager;
		}
		
}

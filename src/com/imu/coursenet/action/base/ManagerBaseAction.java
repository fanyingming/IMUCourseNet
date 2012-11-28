package com.imu.coursenet.action.base;
import com.opensymphony.xwork2.ActionSupport;
import com.imu.coursenet.service.*;
public class ManagerBaseAction extends ActionSupport {
		protected UserManager userManager;
		protected DepartmentManager departmentManager;
		protected SpecialtyManager specialtyManager;
		public void setUserManager(UserManager userManager) {
			this.userManager = userManager;
		}
		public void setDepartmentManager(DepartmentManager departmentManager) {
			this.departmentManager = departmentManager;
		}
		public void setSpecialtyManager(SpecialtyManager specialtyManager) {
			this.specialtyManager = specialtyManager;
		}
		
		
		
}

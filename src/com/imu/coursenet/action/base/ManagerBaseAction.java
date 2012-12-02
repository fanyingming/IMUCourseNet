package com.imu.coursenet.action.base;
import com.opensymphony.xwork2.ActionSupport;
import com.imu.coursenet.service.*;
public class ManagerBaseAction extends ActionSupport {
		protected UserManager userManager;
		protected DepartmentManager departmentManager;
		protected SpecialtyManager specialtyManager;
		protected CourseTypeManager courseTypeManager;
		protected CourseManager courseManager;
		
		public void setUserManager(UserManager userManager) {
			this.userManager = userManager;
		}
		public void setDepartmentManager(DepartmentManager departmentManager) {
			this.departmentManager = departmentManager;
		}
		public void setSpecialtyManager(SpecialtyManager specialtyManager) {
			this.specialtyManager = specialtyManager;
		}
		public void setCourseTypeManager(CourseTypeManager courseTypeManager) {
			this.courseTypeManager = courseTypeManager;
		}
		public void setCourseManager(CourseManager courseManager) {
			this.courseManager = courseManager;
		}
		
		
		
}

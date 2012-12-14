package com.imu.coursenet.action.authority;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.imu.coursenet.action.DownloadCourseWorkAction;
import com.imu.coursenet.dao.CourseWorkDao;
import com.imu.coursenet.dao.impl.CourseWorkDaoImpl;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;
import com.imu.coursenet.service.impl.*;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class StudentDownLoadCourseWorkAuthorityInterceptor extends AbstractInterceptor {
	public String intercept(ActionInvocation invocation) throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的level属性
		String level = (String) ctx.getSession().get("level");
		User user = (User) ctx.getSession().get("user");
		// 如果level不为null，且level为admin
		CourseWorkDao courseWorkDao=new CourseWorkDaoImpl();
		HttpServletRequest request=ServletActionContext.getRequest();
		int courseWorkId= Integer.parseInt(request.getParameter("courseWorkId"));
		System.out.println("==="+courseWorkId);
		//获得要下载作业的ID，通过ID获得作业的上传人，判断当前用户和上传人是否一致
		if (level != null && (level.equals("student"))) {
			
			System.out.println("int intercp");
			CourseWork courseWork= courseWorkDao.get(courseWorkId);
			if(courseWork.getStudent().getUserId()==user.getUserId()){
				return invocation.invoke();
			}
			return Action.LOGIN;
		} else {
			return Action.LOGIN;
		}
	}
}

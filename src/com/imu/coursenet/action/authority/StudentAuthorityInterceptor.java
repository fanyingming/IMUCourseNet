package com.imu.coursenet.action.authority;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.*;

public class StudentAuthorityInterceptor extends AbstractInterceptor {
	public String intercept(ActionInvocation invocation) throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的level属性
		String level = (String) ctx.getSession().get("level");
		// 如果level不为null，且level为student
		if (level != null && (level.equals("student"))) {
			return invocation.invoke();
		} else {
			return Action.LOGIN;
		}
	}
}
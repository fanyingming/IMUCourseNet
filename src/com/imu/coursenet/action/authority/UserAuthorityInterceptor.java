package com.imu.coursenet.action.authority;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserAuthorityInterceptor extends AbstractInterceptor{
	public String intercept(ActionInvocation invocation) throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的level属性
		String level = (String) ctx.getSession().get("level");
		// 如果level不为null，且level为admin
		if (level != null && ((level.equals("admin")) || (level.equals("teacher")) || (level.equals("student")) )) {
			return invocation.invoke();
		} else {
			ctx.getSession().put("tip", "您还未登陆！");
			return Action.ERROR;
		}
	}
}

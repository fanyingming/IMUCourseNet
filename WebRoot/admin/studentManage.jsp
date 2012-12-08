<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'studentManage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/detail.css">

</head>
<body>
	<div class="zhu">
		<div id="top">
			<div class="top_wordbg">
				<div class="top_wor">
					<a>查看学生</a>
				</div>
			</div>
		</div>
		<div id="medium">
			<div class="medium_content">
			<form name="fom" id="fom" method="post" action="">
				<table class="medium_content_tabal1">
					<tr>
						<td style="text-align: left;"><a>选择:</a><a href="#">全选</a><a>&nbsp;—&nbsp;</a><a
							href="#">反选</a> <input type="button" value=" 删  除 ">
							<input type="button" value=" 添 加 " onclick= "fom.action='admin/addStudent.action';fom.submit(); ">
						</td>
					</tr>
					<tr>
						<td width="100%">
							<table border="0" cellpadding="3" cellspacing="1" width="100%"
								align="center"
								style="background-color: #464646;text-align: center;">
								<tr>
									<td height="25" colspan="13" align="left" bgcolor="#aaaaaa"><p>所有学生列表</p>
									</td>
								</tr>
								<tr style="background: #dddddd; font-weight: bold">
									<td width="40">选择</td>
									<td width="71" height="24">编号</td>
									<td width="180">用户名</td>
									<td width="180">密码</td>
									<td width="90">姓名</td>
									<td width="200">邮箱</td>
									<td width="190">部门</td>
									<td width="170">专业</td>
									<td width="120">操作</td>
								</tr>
								<s:iterator value="students" id="student">
									 <tr style="background:#ffffff;">
									 	 <td><input type="checkbox" /></td>
										<td><s:property value="#student.userId" /></td>
										<td><s:property value="#student.userAccount" /></td>
										<td><s:property value="#student.userPass" /></td>
										<td><s:property value="#student.userName" /></td>
										<td><s:property value="#student.userMail" /></td>
										<td><s:property
												value="#student.department.departmentName" /></td>
										<td><s:property value="#student.specialty.specialtyName" /></td>
										<td><a
											href="deleteUser.action?userId=<s:property value="#student.userId"/>">删除
										</a> &nbsp; <a
											href="beforeUpdateStudent.action?userId=<s:property value="#student.userId"/>">修改</a>
										</td>
									</tr>
								</s:iterator>
							</table>
						</td>
					</tr>
					<tr id="bottom">
						<td class="bottom_left">
							<div class="bottom_left">
								共&nbsp;<span>4</span>&nbsp;页&nbsp;|&nbsp;第&nbsp;<span>4</span>&nbsp;页&nbsp;|&nbsp;共&nbsp;<span>17</span>&nbsp;条记录
							</div>
							<div class="bottom_right">
								[&nbsp;<a href="#">首页</a><span>|</span> <a href="#">上一页</a><span>|</span>
								<a href="#">下一页</a><span>|</span> <a href="#">末页</a>&nbsp;]&nbsp;转至:<input
									type="text" size="1" /><input type="button" value="Go">
							</div>
						</td>
					</tr>
				</table>
				</form>
			</div>
			<div class="bottomdown"></div>
		</div>

	</div>
</body>
</html>

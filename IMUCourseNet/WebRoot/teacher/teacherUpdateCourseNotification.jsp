<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>内大教学网-Teaching&&Learning@IMU</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/detail.css">

</head>

</head>
<body>
	<div class="zhu">
		<div id="top">
			<div class="top_wordbg">
				<div class="top_wor">
					<a>修改课程通知</a>
				</div>
			</div>
		</div>
		<div id="medium">
			<div id="add">
				<div class="add_content">
					<a>&nbsp;</a>
					<form name="form1" method="post" action="updateCourseNotification">
						<input type="hidden" name="courseNotificationId" value="<s:property value="courseNotification.courseNotificationId" />">
	    			
						<table width="930" border="0" align="center">

							<tr>
								<td>
									<font size=5>标题：</font>
								</td>
								<td >
									<input type="text" name="title"
									value="<s:property value="courseNotification.title" />">
								</td>
							</tr>
							<tr>
								<td>
										<font size=5>内容：</font>
								</td>
								<td >
										<textarea name="content" cols="70" rows="10"
											style="font-size:17px;">
											<s:property value="courseNotification.content" />
										</textarea>
								</td>
							</tr>
							<tr>
								<td><div align="right"></div>
								</td>
								<td><div align="left">
										<label> <input type="submit" name="Submit" value="保存">
										</label> <label> <input type="reset" name="Submit2" value="重置">
										</label>
									</div>
								</td>
							</tr>
						</table>
					</form>
				</div>

			</div>
			<div class="bottomdown"></div>
		</div>
	</div>
</body>
</html>

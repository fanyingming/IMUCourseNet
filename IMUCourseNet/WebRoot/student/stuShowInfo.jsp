<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show StuInfo.jsp' starting page</title>
    
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
		    		<a>个人信息</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
				<form name="form1" method="post" action="stuUpdate">
				<input type="hidden" name="userId" value="<s:property value="student.userId" />">
	    		<table class="add_content_tab">
	    			<tr>
	    				<td class="addtd1"><a>学号：</a></td><td class="addtd2">
	    				<s:property value="student.userAccount" />
	    				</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"><a>密码：</a></td><td class="addtd2">
	    				  <input type="password" name="userPass" value="<s:property value="student.userPass" />" >
	    				</td>
	    			</tr>
					<tr>
	    				<td class="addtd1"><a>姓名：</a></td><td class="addtd2">
	    				<s:property value="	student.userName" />
	    				</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"><a>邮箱地址：</a></td><td class="addtd2">
	    				<input type="text" name="userMail" value="<s:property value="student.userMail" />">
	    				</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"><a>所在学院：</a></td>
	    				<td class="addtd2">
		    				<s:property value="student.department.departmentName" />
						</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"><a>所学专业：</a></td>
	    				<td class="addtd2">
		    				<s:property value="student.specialty.specialtyName" />
						</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"></td>
	    				<td class="addtd2">
	    				<input type="submit" value="提交" style="font-size:14px;">
	    				<input type="reset" value="重置" style="font-size:14px;"></td>
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

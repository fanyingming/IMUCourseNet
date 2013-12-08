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
    
    <title>My JSP 'head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/style.css">


  </head>
  
  <body>
	   <div>
	   <img src="images/head0.jpg"  />
	   <div id="head2">
	   
	   	<div class="head2_left">
		   	<h4>欢迎您，<s:property value="#session.user.userName"/></h4>
		</div>
		   	<div class="head2_right">
		   		<a href="index.jsp" target="_top">首页</a>
		   		<a href="building.jsp" target="mainFrame">我的课程</a>
		   		<a href="listTeacherMail"  target="mainFrame">我的信箱</a>
		   		<a href="listMessage" target="mainFrame" >留言板</a>
		   		<a href="exit" target="_top">退出</a>
		   	</div>
		   </div>
		   <hr width=100% size=2px color="#d11b2b">
	   </div>
  </body>
</html>

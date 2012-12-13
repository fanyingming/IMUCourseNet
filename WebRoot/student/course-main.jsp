<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="..css/styles.css">

  </head>
  	<frameset rows="105,*,40" frameborder="0">
  		<frame src="student/student-main-top.jsp" name="topFrame" scrolling="no" noresize/>
	<frameset cols="210,*" frameborder="no">
  		<frame src="student/course-main-left.jsp" name="leftFrame" scrolling="no"/>
  		<frame src="showCourseDetail" name="mainFrame"/>
	</frameset>
		<frame src="copyright.jsp" scrolling="no" noresize/>
	</frameset><noframes></noframes>
  <body>
  </body>
</html>

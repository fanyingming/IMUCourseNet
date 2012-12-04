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
    
    <title>Welcome!</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


	

  </head>  
  <body>
  <table width="442" height="27" border="0">
  		<tr>
    	  <td>选修的课程：</td>
    	</tr>
  	<s:iterator value="courseTakings" id="courseTaking">
   		<tr>
    	  <td><a href="goToStudentCourseMainPage.action?courseDetailId=<s:property value="#courseTaking.courseDetail.courseDetailId"/>" target="_top">
    	  		<s:property value="#courseTaking.courseDetail.course.courseName"/> &nbsp;<s:property value="#courseTaking.courseDetail.course.courseType.courseTypeName"/> 
    	  	 </a></td>
    	</tr>
    </s:iterator>
    
  </table>
  <s:debug/>
  </body>
</html>

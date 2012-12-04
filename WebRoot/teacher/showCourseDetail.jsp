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
    
    <title>My JSP 'showCourseDetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <br>
  <table width="832" border="1" align="center">
    <tr>
      <td width="136"><div align="right">课程名称：</div></td>
      <td width="680"><s:property value="courseDetail.course.courseName"/></td>
    </tr>
    <tr>
      <td><div align="right">开课时间：</div></td>
      <td><s:property value="courseDetail.establishDate"/></td>
    </tr>
    <tr>
      <td><div align="right">课程介绍：</div></td>
      <td><s:property value="courseDetail.courseIntroduce"/></td>
    </tr>
    <tr>
      <td><div align="right">教学计划：</div></td>
      <td><s:property value="courseDetail.teachPlan"/></td>
    </tr>
    <tr>
      <td><div align="right">参考书籍：</div></td>
     <td><s:property value="courseDetail.referenceBook"/></td>
    </tr>
    <tr>
      <td><div align="right">课件：</div></td>
      <td>&nbsp;</td>
    </tr>
  </table>
  </body>
</html>

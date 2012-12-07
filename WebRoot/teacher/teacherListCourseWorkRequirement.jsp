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
    
    <title>My JSP 'teacherListCourseWorkRequirement.jsp' starting page</title>
    
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
  <p align="center"><strong>发布的课程作业  </strong></p>
  <s:iterator value="courseWorkRequirements" id="courseWorkRequirement">
  <table width="817" border="0" align="center">
    <tr>
      <td>
	  	<a href="listStudentCourseWork.action?courseWorkRequirementId=<s:property value="#courseWorkRequirement.courseWorkRequirementId"/>"><s:property value="#courseWorkRequirement.title"/></a><br>
	  	<p align="center"><s:property value="#courseWorkRequirement.requirementContent"/></p>
	  	<p align="right">发布日期:<s:date name="#courseWorkRequirement.createDate" format="yyyy-MM-dd HH:mm:ss"/></p>
	  	<p align="right">截止日期:<s:date name="#courseWorkRequirement.deadLine" format="yyyy-MM-dd HH:mm:ss"/></p>
	  </td>
    </tr>
	<hr>
  </table>
  <hr>
  </s:iterator>
  </body>
</html>

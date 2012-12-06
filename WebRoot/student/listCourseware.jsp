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
    
    <title>My JSP 'listUploadCourseware.jsp' starting page</title>
    
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
  <p align="center">课程的课件</p>
  <table width="907" border="0" align="center">
    <tr>
      <td width="755"><div align="left"></div></td>
      <td width="142"><div align="left"></div></td>
    </tr>
     <s:iterator value="coursewares" id="courseware">
	    <tr>
	      <td>
	      	<div align="left">
	      		<a href="downloadCourseware.action?coursewareId=<s:property value="#courseware.coursewareId"/>"><s:property value="#courseware.title"/></a><br>
	      		上传于 <s:date name="#courseware.uploadDate" format="yyyy-MM-dd HH:mm:ss"/>
	     	 </div>
	      </td>
	    </tr>
    </s:iterator>
  </table>

  </body>
</html>

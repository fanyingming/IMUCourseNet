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
    
    <title>My JSP 'listStudentCourseWork.jsp' starting page</title>
    
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
  <div align="center">学生上传的作业,共<s:property value="courseWorkCounts"/>份。<br>
  </div>
  
  <table width="756" height="28" border="0" align="center">
  <s:iterator value="courseWorks" id="courseWork">
    <tr>
      <td width="386"><div align="center">
        <s:property value="#courseWork.student.userName"/>
      </div></td>
      <td width="234"><div align="center">
      	<s:date name="#courseWork.editDate" format="yyyy-MM-dd HH:mm:ss"/>  
      </div></td>
      <td width="114">
   	    <div align="center">
   	         <a href="teacherDownloadCourseWork.action?courseWorkId=<s:property value="#courseWork.courseWorkId"/>">查看</a>
   	    </div></td>
    </tr>
   </s:iterator>
  </table>
  </body>
</html>

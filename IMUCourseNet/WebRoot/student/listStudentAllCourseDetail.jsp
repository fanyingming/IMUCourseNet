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


	<link rel="stylesheet" type="text/css" href="css/detail.css">

  </head>  
  <body>
<div class="zhu">
	    <div id="top">
	    	<div class="top_wordbg">
		    	<div class="top_wor">
		    		<a>选的所有课程</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
		<table width="907" border="0" align="center" bordercolor="#000000">
    <tr>
      <td width="371"><div align="center">课程名称</div></td>
      <td width="104"><div align="center">课程类别</div></td>
      <td width="123"><div align="center">开课学院</div></td>
      <td width="150"><div align="center">开课时间</div></td>
      <td width="125"><div align="center">开课教师</div></td>
    </tr>
	<s:iterator value="courseTakings" id="courseTaking">
    <tr>
      <td><div align="center">
	  	<a href="goToStudentCourseMainPage.action?courseDetailId=<s:property value="#courseTaking.courseDetail.courseDetailId"/>" target="_top">
			<s:property value="#courseTaking.courseDetail.course.courseName"/>
		</a></div>
	  </td>
      <td><div align="center">
	  	<s:property value="#courseTaking.courseDetail.course.courseType.courseTypeName"/>
	  </div></td>
      <td><div align="center">
      <s:property value="#courseTaking.courseDetail.course.department.departmentName"/>
	  	
	  </div></td>
      <td><div align="center">
	  	<s:date name="#courseTaking.courseDetail.establishDate" format="yyyy-MM-dd"/>
	  </div></td>
      <td><div align="center">
	  	<s:property value="#courseTaking.courseDetail.teacher.userName"/>
	  </div></td>
    </tr>
    </s:iterator>
  </table>
			</div>
			
	    </div>
	    <div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

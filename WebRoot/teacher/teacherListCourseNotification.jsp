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
    
    <title>内大教学网-Teaching&&Learning@IMU</title>
    
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
		    		<a>课程通知</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
			<table width="783"  border="0" align="center">
    		<tr style="background:#bbbbbb;">						
			<td width="300px">通知标题</td>
			<td width="150px">查看次数</td>
			<td width="200px">发布时间</td>
			<td width="150px">操作</td>
	</tr>
	<s:iterator value="courseNotifications" id="notification">
    <tr>
       <td >
	    	 <a href="teacherShowCourseNotificationDetail?courseNotificationId=<s:property value="#notification.courseNotificationId"/>"><s:property value="#notification.title"/></a>
       </td>
       
       <td >
      		 <s:property value="#notification.checkCounts"/>
       </td>
       <td >
	     	<s:property value="#notification.editDate"/>
       </td>
       <td> 	
		  	<div align="left">
	      	 	<a href="deleteCourseNotification?courseNotificationId=<s:property value="#notification.courseNotificationId"/>">删除 </a>
	      	 	<a href="beforeUpdateCourseNotification?courseNotificationId=<s:property value="#notification.courseNotificationId"/>">修改 </a>
			</div>
	   </td>
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

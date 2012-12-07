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
    
    <title>My JSP 'listCourseNotification.jsp' starting page</title>
    
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
  <table width="783"  border="0" align="center">
    
    <tr>
    									
			<td width="250px">通知标题</td>
			<td width="180px">内容</td>
			<td width="150px">次数</td>
			<td width="150px">时间</td>
		
	</tr>
	
	<s:iterator value="courseNotifications" id="notification">
			    <tr>
			       <td >
				    	 <s:property value="#notification.title"/>
			       </td>
			       <td >
				         <s:property value="#notification.content"/>
			       </td>
			       <td >
			      		 <s:property value="#notification.checkCounts"/>
			       </td>
			       <td >
			       <s:date name="#notification.editDate" format="yyyy-MM-dd HH:mm:ss"/>
				     	
			       </td>
			       
			    </tr>
		      </s:iterator>  

  </table>
 
  <s:debug/>
 
  </body>
</html>

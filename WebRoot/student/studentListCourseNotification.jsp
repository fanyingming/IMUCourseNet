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
	<link rel="stylesheet" type="text/css" href="css/detail.css">

  </head>
  
  <body>

  	<div class="zhu">
	    <div id="top">
	    	<div class="top_wordbg">
		    	<div class="top_wor">
		    		<a>查看通知</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
		  <table width="840"  border="0" align="center">
    
    <tr>
    									
			<td width="420"><div align="center">通知标题</div></td>
			<td width="117"><div align="center">查看次数</div></td>
			<td width="289"><div align="center">发布时间</div></td>
	</tr>
	
	<s:iterator value="courseNotifications" id="notification">
			    <tr>
			       <td >
				    	 <div align="center"> 
				    	  <a href="showCourseNotificationDetail?courseNotificationId=<s:property value="#notification.courseNotificationId"/>">
				    	  	 <s:property value="#notification.title"/>	
				    	  </a>		       
		    	     </div></td>
			       <td >
			      		 <div align="center">
			      		   <s:property value="#notification.checkCounts"/>			       
	      		     </div></td>
			       <td >
			         <div align="center">
			           <s:date name="#notification.editDate" format="yyyy-MM-dd HH:mm:ss"/>			       
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

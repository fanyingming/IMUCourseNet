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
    
    <title>My JSP 'showCourseNotificationDetail.jsp' starting page</title>
    
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
		    <table width="885" border="0" align="center">
    <tr>
      <td align="center">
      <div >
      	<h2><s:property value="courseNotification.title"/></h2>
       	<p style="font-size:18px; color:#555555;text-align:right;margin-right:12px;">
       	<span><font color="#222222">发布于:</font><s:date name="courseNotification.editDate" format="yyyy-MM-dd HH:mm:ss"/></span>
       	<span><font color="#222222">点击量：</font><s:property value="courseNotification.checkCounts"/></span>
       	</p>			       
       </div>
      </td>
    </tr>
    <tr>
      <td>
        <div style="width: 800px;">
      		<font size=4><s:property value="courseNotification.content"/></font>
      	</div>
      </td>
    </tr>
  
  </table>
  
			</div>
			
	    </div>
	    <div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

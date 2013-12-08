<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
		    		<a>管理员首页</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div class="medium_content">
		    <h2>Welcome，administrator.</h2>
		    </div>
		    <div class="bottomdown"></div>
	    </div>
	    
    </div>
  </body>
</html>

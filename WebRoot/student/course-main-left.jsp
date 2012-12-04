<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    
    <title>menu</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/detail.css">
	<script type="text/javascript" src="index-js/jquery.min.js"></script>
	<script type="text/javascript" src="index-js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="index-js/xixi.js"></script>

  </head>
  
  <body>
	<div id="main">
  <ul class="container">
      <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">查看课程内容 <span></span></a></li>
            <li class="dropdown">
                <ul>
                    <li><a href="#" target="mainFrame">查看通知</a></li>
                    <li><a href="#" target="mainFrame">下载课件</a></li>
                    <li><a href="#" target="mainFrame">查看课程介绍</a></li>
                    <li><a href="#" target="mainFrame">查看教学计划</a></li>
                    <li><a href="#" target="mainFrame">查看参考书籍</a></li>
                </ul>
			</li>
          </ul>
      </li>
      
	  <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">师生互动 <span></span></a></li>
            <li class="dropdown">
                <ul>
                    <li><a href="#" target="mainFrame">查看帖子</a></li>
                    <li><a href="#" target="mainFrame">查看留言</a></li>
                    
                </ul>
			</li>
          </ul>
      </li>
	  
	  
	  <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">私密信箱 <span></span></a></li>
            <li class="dropdown">
                <ul>
                    <li><a href="#" target="mainFrame">写信</a></li>
                    <li><a href="#" target="mainFrame">已发信件</a></li>
                    
                </ul>
			</li>
          </ul>
      </li>
	  
	 
	


<div class="clear"></div>
</div>
  </body>
</html>

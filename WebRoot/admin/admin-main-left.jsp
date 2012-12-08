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
		    <li class="button"><a href="#" class="red">人员管理 <span></span></a></li>
            <li class="dropdown">
                <ul>
                    <li><a href="listAdmin.action" target="mainFrame">查看管理员</a></li>
                    <li><a href="listTeacher.action" target="mainFrame">查看教师</a></li>
                    <li><a href="listStudent.action" target="mainFrame">查看学生</a></li>
                     <li><a href="adminShowInfo.action" target="mainFrame">查看个人信息</a></li>
                </ul>
			</li>
          </ul>
      </li>
      
      <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">部门专业管理 <span></span></a></li>          	

            <li class="dropdown">
                <ul>
                    <li><a href="listDepartment.action" target="mainFrame">查看部门</a></li>
                    <li><a href="listSpecialty.action" target="mainFrame">查看专业</a></li>
                    
                </ul>
			</li>
          </ul>
      </li>
 
      <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">课程管理 <span></span></a></li>

            <li class="dropdown">
                <ul>
                    <li><a href="listCourse.action" target="mainFrame">查看课程</a></li>
                    <li><a href="listCourseType.action" target="mainFrame">课程类型管理</a></li>
					<li><a href="admin/addCourseDetail.jsp" target="mainFrame">教师开课</a></li>
                    <li><a href="listCourseDetail" target="mainFrame">查看开设课程</a></li>
                    <li><a href="admin/addCourseTaking.jsp" target="mainFrame">学生选课</a></li>
					<li><a href="adminListCourseTaking.action" target="mainFrame">查看选课信息</a></li>
                </ul>
			</li>
          </ul>
      </li>

    
      <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">留言管理 <span></span></a></li>

            <li class="dropdown">
                <ul>
                    <li><a href="adminListMessage.action" target="mainFrame">查看留言</a></li>
                    <li><a href="#" target="mainFrame">设置过滤关键字</a></li>
                    
                </ul>
			</li>
          </ul>
      </li>
      
       <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">通知管理 <span></span></a></li>

            <li class="dropdown">
                <ul>
                	<li><a href="#" target="mainFrame">添加通知</a></li>
                    <li><a href="#" target="mainFrame">查看通知</a></li>
                    
                    
                </ul>
			</li>
          </ul>
      </li>
      
      <li class="menu">
          <ul>
		    <li class="button"><a href="#" class="red">新闻管理 <span></span></a></li>

            <li class="dropdown">
                <ul>
                	<li><a href="#" target="mainFrame">添加新闻</a></li>
                    <li><a href="#" target="mainFrame">查看新闻</a></li>
                    
                    
                </ul>
			</li>
          </ul>
      </li>
  </ul>

<div class="clear"></div>
</div>
  </body>
</html>

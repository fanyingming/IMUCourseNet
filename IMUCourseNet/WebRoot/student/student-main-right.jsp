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
		    		<a>学生首页</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div id="stu">
	    	<div class="stu_left">
	    		<div id="course">
	    			<div class="course_top"><a>课程</a></div>
	    			<div class="course_mid">
	    				<s:iterator value="courseTakings" id="courseTaking">
	    				<div>
	    					<a href="goToStudentCourseMainPage.action?courseDetailId=<s:property value="#courseTaking.courseDetail.courseDetailId"/>" target="_top">
	  		<s:property value="#courseTaking.courseDetail.course.courseName"/>
		</a>
		,
		<s:property value="#courseTaking.courseDetail.course.courseType.courseTypeName"/>
   		,<s:property value="#courseTaking.courseDetail.teacher.userName"/>
	    				</div>
	    				</s:iterator>
	    			</div>
	    			<div class="course_bottom"><a>more>></a></div>
	    		</div>
			</div>
	    	<div class="stu_right">
				<div id="tips">
					<div class="tips_top">
					<a>课程通知</a>
					</div>
					<div class="tips_mid">
						<ul>
						<s:iterator value="courseNotifications" id="courseNotification">
							<li>
								<a href="showCourseNotificationDetail?courseNotificationId=<s:property value="#courseNotification.courseNotificationId"/>">
	  		<s:property value="#courseNotification.title"/>
		</a>
							<span>
								<s:date name="#courseNotification.editDate" format="yyyy-MM-dd HH:mm:ss"/>
							</span></li>
						</s:iterator>	
						</ul>
					</div>
					<div class="tips_bottom"><a>more>></a></div>
				</div>
			</div>
	    	</div>
	    	<div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

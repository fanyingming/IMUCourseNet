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
		    		<a>开设的课程</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
				 <table width="644" border="0">
	 
  	<s:iterator value="courseDetails" id="courseDetail">
   		<tr>
      		<td>
      			<a href="goToTeacherCourseMainPage.action?courseDetailId=<s:property value="#courseDetail.courseDetailId"/>" target="_top">
					<s:property value="#courseDetail.course.courseName"/>&nbsp;,&nbsp;<s:property value="#courseDetail.course.courseType.courseTypeName"/>,&nbsp;<s:property value="#courseDetail.establishDate"/>
				</a>
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

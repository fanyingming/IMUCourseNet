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


	

  </head>  
  <body>
  <table width="100%" border="1">
  <tr>
    <td width="55%">
			<table width="487" height="74" border="1">
    <tr>
      <td colspan="3"><div align="center">选择的课程</div></td>
    </tr>
	<s:iterator value="courseTakings" id="courseTaking">
    <tr>
      <td width="135">
	  	<a href="goToStudentCourseMainPage.action?courseDetailId=<s:property value="#courseTaking.courseDetail.courseDetailId"/>" target="_top">
	  		<s:property value="#courseTaking.courseDetail.course.courseName"/>
		</a>
	  </td>
      <td width="156"><s:property value="#courseTaking.courseDetail.teacher.userName"/> </td>
      <td width="174"><s:property value="#courseTaking.courseDetail.course.courseType.courseTypeName"/> </td>
    </tr>
	</s:iterator>
  </table>
	</td>
	
    <td width="45%">
	  <table width="485" border="1">
          <tr>
            <td colspan="2"><div align="center">课程通知</div></td>
          </tr>
          <tr>
            <td width="322">&nbsp;</td>
            <td width="130">&nbsp;</td>
          </tr>
        </table>	</td>
  </tr>
</table>

  
  
  
    

  <s:debug/>
  </body>
</html>

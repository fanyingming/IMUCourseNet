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
    
    <title>My JSP 'showCourseDetail.jsp' starting page</title>
    
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
		    		<a>课程内容</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
			<table width="832"  >
    <tr>
      <td width="136"><div align="right">课程名称：</div></td>
      <td width="680">
      <br>
      <s:property value="courseDetail.course.courseName"/>
      <br>
      <hr>
      </td>
      
    </tr>
    <tr>
      <td><div align="right">开课时间：</div></td>
      <td>
      <br>
      <s:date name="courseDetail.establishDate" format="yyyy-MM-dd"/>
       <br>
      <hr>
      </td>
    </tr>
    <tr>
      <td><div align="right">课程介绍：</div></td>
      <td>
      <br>
      <s:property value="courseDetail.courseIntroduce"/>
      <br>
      <hr>
      </td>
       
    </tr>
    <tr>
      <td><div align="right">教学计划：</div></td>
      <td>
      <br>
      <s:property value="courseDetail.teachPlan"/>
      <br>
      <hr>
      </td>
       
    </tr>
    <tr>
      <td><div align="right">参考书籍：</div></td>
     <td>
     <br><s:property value="courseDetail.referenceBook"/>
     <br>
      <hr>
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

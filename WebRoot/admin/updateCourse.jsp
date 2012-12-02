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
    
    <title>My JSP 'updateCourse.jsp' starting page</title>
    
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
  <br>
  <form name="form1" method="post" action="updateCourse">
   <input type="hidden" name="courseId" value="<s:property value="courseId"/>"/>
    <table width="830" border="1" align="center">
       <tr>
        <td><div align="right">名字：
        </div></td>
        <td><div align="left">
          <input type="text" name="courseName"  value="<s:property value="course.courseName" />">
        </div></td>
      </tr>
      <tr>
        <td><div align="right">简介：</div></td>
        <td><div align="left">
          <input type="text" name="courseDescription"  value="<s:property value="course.courseDescription" />">
        </div></td>
      </tr>
      <tr>
        <td><div align="right">部门号：</div></td>
        <td><div align="left">
          <label>
          <select name="departmentId">
          <s:iterator value="departments" id="department">
          	<option value="<s:property value="#department.departmentId"/>">
          		<s:property value="#department.departmentName"/>
          	</option>
          </s:iterator>
          </select>
          </label>
        </div></td>
      </tr> <tr>
        <td><div align="right">课程类型：</div></td>
        <td><div align="left">
          <label>
          <select name="courseTypeId">
          <s:iterator value="courseTypes" id="courseType">
          	<option value="<s:property value="#courseType.courseTypeId"/>">
          		<s:property value="#courseType.courseTypeName"/>
          	</option>
          </s:iterator>
          </select>
          </label>
        </div></td>
      </tr>
      <tr>
        <td><div align="right"></div></td>
        <td><div align="left">
          <label>
          <input type="submit" name="Submit" value="修改">
          </label>
          <label>
          <input type="reset" name="Submit2" value="取消">
          </label>
        </div></td>
      </tr>
    </table>
 
  <s:debug/>
  </body>
</html>

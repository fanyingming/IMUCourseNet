<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'courseTypeManage.jsp' starting page</title>
    
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
  <table width="1114" border="1" align="center">
    <tr bgcolor="#CCCCCC">
      <td width="171" height="24">编号</td>
      <td width="255">部门</td>
      <td width="316">简介</td>
      <td width="316">操作</td>
    </tr>
   <s:iterator value="courseTypes" id="courseType">
   <tr>
      <td><s:property value="#courseType.courseTypeId"/></td>
      <td><s:property value="#courseType.courseTypeName"/></td>
      <td><s:property value="#courseType.courseTypeDescription"/></td>
       <td> 	
       <a href="deleteCourseType.action?courseTypeId=<s:property value="#courseType.courseTypeId"/>">删除 </a>
			&nbsp;&nbsp;
		<a href="beforeUpdateCourseType.action?courseTypeId=<s:property value="#courseType.courseTypeId"/>">修改</a></td>
  </tr>
    </s:iterator>
  </table>
  <s:debug/>
  <div align="right"><a href="admin/addCourseType.jsp">增加</a>
  </div>
  </body>
</html>

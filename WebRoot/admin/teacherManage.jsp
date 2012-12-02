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
    
    <title>My JSP 'teacherrManage.jsp' starting page</title>
    
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
      <td width="71" height="24">编号</td>
      <td width="109">用户名</td>
      <td width="117">密码</td>
      <td width="117">姓名</td>
      <td width="154">邮箱</td>
      <td width="155">部门</td>
      <td width="123">专业</td>
      <td width="216">操作</td>
    </tr>
    <s:iterator value="teachers" id="teacher">
    <tr>
      <td><s:property value="#teacher.userId"/></td>
      <td><s:property value="#teacher.userAccount"/></td>
      <td><s:property value="#teacher.userPass"/></td>
      <td><s:property value="#teacher.userName"/></td>
      <td><s:property value="#teacher.userMail"/></td>
      <td><s:property value="#teacher.department.departmentName"/></td>
      <td>&nbsp;</td>
      <td><a href="deleteUser.action?userId=<s:property value="#teacher.userId"/>">删除</a>&nbsp;&nbsp;<a href="beforeUpdateTeacher.action?userId=<s:property value="#teacher.userId"/>">修改</a></td>
    </tr>
    </s:iterator>
  </table>
  <s:debug/>
  <div align="right"><a href="addTeacher.action">增加</a>
  </div>
  </body>
</html>

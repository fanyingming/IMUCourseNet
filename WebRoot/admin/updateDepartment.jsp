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
    
    <title>My JSP 'addAdmin.jsp' starting page</title>
    
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
  <form name="form1" method="post" action="updateDepartment">
   <input type="hidden" name="departmentId" value="<s:property value="departmentId"/>"/>
    <table width="830" border="1" align="center">
       <tr>
        <td><div align="right">名字：
        </div></td>
        <td><div align="left">
          <input type="text" name="departmentName"  value="<s:property value="department.departmentName" />">
        </div></td>
      </tr>
      <tr>
        <td><div align="right">简介：</div></td>
        <td><div align="left">
          <input type="text" name="departmentDescription"  value="<s:property value="department.departmentDescription" />">
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

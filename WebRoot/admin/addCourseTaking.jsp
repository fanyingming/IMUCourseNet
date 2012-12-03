<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addCourseTaking.jsp' starting page</title>
    
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
  <form name="form1" method="post" action="addCourseTaking">
    <table width="639" border="1" align="center">
      <tr>
        <td width="168"><div align="right">学生编号：</div></td>
        <td width="455"><label>
          <input type="text" name="userId">
        </label></td>
      </tr>
      <tr>
        <td><div align="right">开设课程编号：</div></td>
        <td><label>
          <input type="text" name="courseDetailId">
        </label></td>
      </tr>
      <tr>
        <td><div align="right"></div></td>
        <td><label>
          <input type="submit" name="Submit" value="提交">
        </label>
          <label>
          <input type="reset" name="Submit2" value="重置">
        </label></td>
      </tr>
    </table>
  </form>
  </body>
</html>

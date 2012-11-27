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
    
    <title>登 陆</title> 
    
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
  <br><br><br>
  
  <hr>
  <form name="form1" method="post" action="login">
    <table width="445" border="0" align="right">
      <tr>
        <td width="117"><div align="right">用户名</div></td>
        <td width="312"><label>
          <input type="text" name="userAccount">
        </label></td>
      </tr>
      <tr>
        <td><div align="right">密 码</div></td>
        <td><label>
          <input type="text" name="userPass">
        </label></td>
      </tr>
      <tr>
        <td><div align="right"></div></td>
        <td><label>
          <input type="submit" name="Submit" value="登陆">
        </label>
          <label>
          <input type="reset" name="Submit2" value="重置">
        </label></td>
      </tr>
    </table>
  </form>
  
  </body>
</html>

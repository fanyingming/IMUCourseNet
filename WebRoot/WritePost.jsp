<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'WritePost.jsp' starting page</title>
    
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
        <form name="form1" method="post" action="writePost">
        <table>
           <tr>
              <td>标题</td>
              <td><input type="text" name="title" style="lenght:30px;"/></td>
           </tr>
           <tr>
              <td>内容</td>
              <td><textarea name="content" cols="105" rows="10"></textarea></td>
           </tr>
        </table>
        <input type="submit" value="发帖子" style="font-size:18px;"/>
        </form>
  </body>
</html>

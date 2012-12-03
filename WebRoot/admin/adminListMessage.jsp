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
    
    <title>My JSP 'listMessage.jsp' starting page</title>
    
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
  <table width=890 border="0" align="center">
  <tr>
  	<td>共&nbsp;<s:property value="messageNum"/>&nbsp;条留言</td>
  </tr>
  <tr>
  <td>
  <s:iterator value="messages" id="message">
  <table width="783"  border="0" align="center">
    
    <tr>
      <td  >
      <div align="center">
      	<s:property value="#message.content"/>
      	</div>      </td>
    </tr>
    <tr>
      <td >
      		
      		<div align="right">
      			<s:property value="#message.editDate"/>
      			&nbsp;  &nbsp;
      			by &nbsp;&nbsp;
      		  	<s:property value="#message.user.userName"/>
            </div>       </td>
	  <td> 	
	  	<div align="right">
      	 	<a href="deleteMessage.action?messageId=<s:property value="#message.messageId"/>">删除 </a>
		</div>
	</td>
    </tr>
  </table>
  
  <hr>
  </s:iterator>   </td>
  </tr>
   
  </table>
  <s:debug/>
 
  </body>
</html>

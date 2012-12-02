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
    
    <title>My JSP 'updateSpecialty.jsp' starting page</title>
    
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
  <form name="form1" method="post" action="updateSpecialty">
   <input type="hidden" name="specialtyId" value="<s:property value="specialtyId"/>"/>
    <table width="830" border="1" align="center">
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
      </tr>
       <tr>
        <td><div align="right">名字：
        </div></td>
        <td><div align="left">
          <input type="text" name="specialtyName"  value="<s:property value="specialty.specialtyName" />">
        </div></td>
      </tr>
      <tr>
        <td><div align="right">简介：</div></td>
        <td><div align="left">
          <input type="text" name="specialtyDescription"  value="<s:property value="specialty.specialtyDescription" />">
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

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
  <form name="form1" method="post" action="updateStudent">
  <input type="hidden" name="userId" value="<s:property value="userId"/>"/>
    <table width="830" border="1" align="center">
      <tr>
        <td width="225"><div align="right">账号：</div></td>
        <td width="589"><div align="left">
          <label>
          <input type="text" name="userAccount" value="<s:property value="student.userAccount" />">
          </label>
        </div></td>
      </tr>
      <tr>
        <td><div align="right">密码：
        </div></td>
        <td><div align="left">
          <input type="password" name="userPass" value="<s:property value="student.userPass" />" >
        </div></td>
      </tr>
      <tr>
        <td><div align="right">姓名：</div></td>
        <td><div align="left">
          <input type="text" name="userName" value="<s:property value="student.userName" />">
        </div></td>
      </tr>
      <tr>
        <td><div align="right">邮箱地址：</div></td>
        <td><div align="left">
          <input type="text" name="userMail" value="<s:property value="student.userMail" />">
        </div></td>
      </tr>
      <tr>
        <td><div align="right">所在部门：</div></td>
        <td><div align="left">
          <label>
          <select name="departmentId">
          <s:iterator value="departments" id="department">
          	<option value="<s:property value="#department.departmentId"/>"      
          		<s:if test=" #department.departmentId == department_Id">
          			selected="selected"
          		</s:if>
          	
          	>
          		<s:property value="#department.departmentName"/>
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
          <input type="reset" name="Submit2" value="重置">
          </label>
        </div></td>
      </tr>
    </table>
  </form>
  
  <s:debug/>
  </body>
</html>

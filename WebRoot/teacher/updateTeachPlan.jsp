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
    
    <title>My JSP 'updateRefBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/detail.css">

  </head>
  <body>

   <div class="zhu">
	    <div id="top">
	    	<div class="top_wordbg">
		    	<div class="top_wor">
		    		<a>修改教学计划</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
				 <form name="form1" method="post" action="editTeachPlan">
    <table width="830" border="0" align="center">
       <tr>
        <td><div align="right">教学计划：
        </div></td>
        <td><div align="left">
         
          <textarea name="teachPlan" cols="100" rows="10"><s:property value="courseDetail.teachPlan" /></textarea>
         
        </div></td>
      </tr>
      <tr>
        <td><div align="right"></div></td>
        <td><div align="left">
          <label>
          <input type="submit" name="Submit" value="保存">
          </label>
          <label>
          <input type="reset" name="Submit2" value="重置">
          </label>
        </div></td>
      </tr>
    </table>
  </form>
			</div>
			
	    </div>
	    <div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

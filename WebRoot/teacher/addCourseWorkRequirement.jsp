<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addCourseWorkRequirement.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/detail.css">
	<script language=javascript src="js/wpCalendar.js"></script>
  </head>
  
  <body>
   <div class="zhu">
	    <div id="top">
	    	<div class="top_wordbg">
		    	<div class="top_wor">
		    		<a>发布作业</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
				 <form name="form1" method="post" action="addCourseWorkRequirement">
    <div align="center"><strong>新建课程作业及要求    </strong></div>
    <table width="718" border="0" align="center">
      <tr>
        <td width="153"><div align="right">标题</div></td>
        <td width="477"><label>
          <input type="text" name="title">
        </label></td>
      </tr>
      <tr>
        <td><div align="right">作业内容及要求</div></td>
        <td rowspan=3><label>
          <textarea name="requirementContent" cols="70" rows="10"></textarea>
        </label></td>
      </tr>
      <tr>
		<td></td>
	  </tr>
	  <tr>
		<td></td>
	  </tr>
      <tr>
        <td><div align="right">截止日期</div></td>
        <td><label>
        
		<input type=text  name="deadLine" size=22 id=text1 onfocus="showCalendar(this)">
        </label></td>
      </tr>
      <tr>
        <td><div align="right"></div></td>
        <td><label>
          <input type="submit" name="Submit" value="提交">
        </label></td>
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

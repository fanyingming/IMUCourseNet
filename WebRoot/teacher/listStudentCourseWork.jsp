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
    
    <title>My JSP 'listStudentCourseWork.jsp' starting page</title>
    
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
		    		<a>学生作业</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
	    	<div align="center"><span style="font-size:20px;">学生上传的作业,共</span><a style="font-size:20px;color:#d11b2b;font-weight:bold;"><s:property value="courseWorkCounts"/></a><span  style="font-size:20px;">份。</span><br></div>
				  <table width="756" height="28" border="0" align="center" style="font-size:20px;">
  <s:iterator value="courseWorks" id="courseWork">
    <tr>
    	<td width="100"><div align="center">1</div></td>
      <td width="200"><div align="left">
        <s:property value="#courseWork.student.userName"/>
      </div></td>
      <td width="254"><div align="left">
      	<s:date name="#courseWork.editDate" format="yyyy-MM-dd HH:mm:ss"/>  
      </div></td>
      <td width="114">
   	    <div align="center">
   	         <a href="teacherDownloadCourseWork.action?courseWorkId=<s:property value="#courseWork.courseWorkId"/>">查看</a>
   	    </div></td>
    </tr>
   </s:iterator>
  </table>
			</div>
			
	    </div>
	    <div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

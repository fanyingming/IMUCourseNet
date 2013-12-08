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
    
    <title>My JSP 'listUploadCourseware.jsp' starting page</title>
    
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
		    		<a>课程课件</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
		<table width="907" border="0" align="center">
    <tr>
      <td width="755"><div align="left"></div></td>
      <td width="142"><div align="left"></div></td>
    </tr>
     <s:iterator value="coursewares" id="courseware">
	    <tr>
	      <td>
	      <table>
		      <tr>
		      	<td width="600px">
		      	<div align="left">
		      		<a href="studentDownloadCourseware?coursewareId=<s:property value="#courseware.coursewareId"/>"><s:property value="#courseware.title"/></a>
		      	</div>
		      	</td>
		      	<td width="250px">
		      	<div>
		      		上传于 <s:date name="#courseware.uploadDate" format="yyyy-MM-dd HH:mm:ss"/>
		     	 </div>
		     	 </td>
		      </tr>
	   	  </table>
	     	 <hr>
	      </td>
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

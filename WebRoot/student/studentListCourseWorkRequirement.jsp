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
    
    <title>My JSP 'studentListCourseWorkRequirement.jsp' starting page</title>
    
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
		    		<a>课程作业</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
	    	<div align="center"><strong>共有<s:property value="courseWorkCounts"/>个作业</strong><br>
		  <s:iterator value="courseWorkRequirements" id="courseWorkRequirement">
    <table width="538" border="0" align="center">
      <tr>
        <td colspan="2">
        	<a href="showCourseWorkRequirementDetail.action?courseWorkRequirementId=<s:property value="#courseWorkRequirement.courseWorkRequirementId"/>"><s:property value="#courseWorkRequirement.title"/></a>
        </td>
      </tr>
      <tr>
        <td width="268">发布日期:
        <s:date name="#courseWorkRequirement.createDate" format="yyyy-MM-dd HH:mm:ss"/></td>
        <td width="260">截止日期:
        <s:date name="#courseWorkRequirement.deadLine" format="yyyy-MM-dd HH:mm:ss"/></td>
      </tr>
    </table>
    </s:iterator>
			</div>
			
	    </div>
	    <div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

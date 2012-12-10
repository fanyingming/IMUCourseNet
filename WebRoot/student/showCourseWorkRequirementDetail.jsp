<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'showCourseWorkRequirementDetail.jsp' starting
	page</title>

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
		    		<a>上传作业</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
			<table width="766" border="0" align="center">
		<tr>
			<td width="139"><div align="right">题目：</div>
			</td>
			
			<td width="592">
			<br>
			<s:property value="courseWorkRequirement.title" />
			<br>
			<hr>
			</td>
		</tr>
		<tr>
			<td><div align="right">作业内容及要求：</div>
			</td>
			<td>
			<br>
			<s:property value="courseWorkRequirement.requirementContent" />
			<br>
			<hr>
			</td>
		</tr>
		<tr>
			<td><div align="right">发布日期：</div>
			</td>
			<td>
			<br>
			<s:date name="courseWorkRequirement.createDate"
					format="yyyy-MM-dd HH:mm:ss" />
					<br>
			<hr>
			</td>
		</tr>
		<tr>
			<td><div align="right">截止日期：</div>
			</td>
			<td>
			<br>
			<s:date
					name="courseWorkRequirement.deadLine"
					format="yyyy-MM-dd HH:mm:ss" />
					<br>
			<hr>
			</td>
		</tr>
		<tr>
			<td><div align="right">上传作业：</div>
			</td>
			<td>
			<br>
				<s:form action="uploadCourseWork"
					enctype="multipart/form-data">
					
					 <s:set name="workRequirementId" value="courseWorkRequirement.courseWorkRequirementId"></s:set>
					<s:hidden name="courseWorkRequirementId" value="%{workRequirementId}"></s:hidden>

					
					<s:file name="upload" label="选择文件" />
					<br />
					<s:submit value="上传" />
				</s:form>
				<br>
			<hr>
			</td>
		</tr>
	</table>
			</div>
			
	    </div>
	    <div class="bottomdown"></div>
	    </div>
	</div>
</body>
</html>

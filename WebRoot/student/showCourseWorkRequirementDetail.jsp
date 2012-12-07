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
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<br>
	<table width="766" border="0" align="center">
		<tr>
			<td width="139"><div align="right">题目：</div>
			</td>
			<td width="592"><s:property value="courseWorkRequirement.title" />
			</td>
		</tr>
		<tr>
			<td><div align="right">作业内容及要求：</div>
			</td>
			<td><s:property value="courseWorkRequirement.requirementContent" />
			</td>
		</tr>
		<tr>
			<td><div align="right">发布日期：</div>
			</td>
			<td><s:date name="courseWorkRequirement.createDate"
					format="yyyy-MM-dd HH:mm:ss" />
			</td>
		</tr>
		<tr>
			<td><div align="right">截止日期：</div>
			</td>
			<td><s:date
					name="courseWorkRequirement.deadLine"
					format="yyyy-MM-dd HH:mm:ss" />
			</td>
		</tr>
		<tr>
			<td><div align="right">上传作业：</div>
			</td>
			<td>
				<s:form action="uploadCourseWork"
					enctype="multipart/form-data">
					
					 <s:set name="workRequirementId" value="courseWorkRequirement.courseWorkRequirementId"></s:set>
					<s:hidden name="courseWorkRequirementId" value="%{workRequirementId}"></s:hidden>

					
					<s:file name="upload" label="选择文件" />
					<br />
					<s:submit value="上传" />
				</s:form>
			</td>
		</tr>
	</table>
</body>
</html>

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
    
    <title>My JSP 'updateCourse.jsp' starting page</title>
    
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
		    		<a>修改课程信息</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    <div id="add">
	    	<div class="add_content">
	    	<a>&nbsp;</a>
				<form name="form1" method="post" action="updateCourse">
				<input type="hidden" name="courseId" value="<s:property value="course.courseId" />">

	    		<table class="add_content_tab">
	    			<tr>
	    				<td class="addtd1"><a>课程名称：</a></td><td class="addtd2">
	    				<input type="text" name="courseName"  value="<s:property value="course.courseName" />">
	    				</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"><a>描述：</a></td><td class="addtd2" rowspan=3>
	    				<textarea name="courseDescription" cols="105" rows="10" ><s:property value="course.courseDescription" /></textarea>
	    				</td>
	    			</tr>
	    			<tr><td></td></tr>
					<tr><td></td></tr>
					<tr><td></td></tr>
					<tr>
	    				<td class="addtd1"><a>开设学院：</a></td><td class="addtd2">
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
	    				</td>
	    			</tr>
	    			<tr>
	    				<td class="addtd1"><a>课程类型：</a></td><td class="addtd2">
	    				<select name="courseTypeId">
          <s:iterator value="courseTypes" id="courseType">
          	<option value="<s:property value="#courseType.courseTypeId"/>"
          		<s:if test=" #courseType.courseTypeId == courseType_Id">
          			selected="selected"
          		</s:if>
          	>
          		<s:property value="#courseType.courseTypeName"/>
          	</option>
          </s:iterator>
          </select>
	    				</td>
	    			</tr>
	    			
	    			<tr>
	    				<td class="addtd1"></td>
	    				<td class="addtd2">
	    				<input type="submit" value="提交" style="font-size:14px;">
	    				<input type="reset" value="重置" style="font-size:14px;"></td>
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

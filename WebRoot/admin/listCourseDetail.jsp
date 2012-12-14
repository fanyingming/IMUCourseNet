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
    
    <title>Welcome!</title>
    
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
		    		<a>开设的课程</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div class="medium_content">
		    <table class="medium_content_tabal1">
			    <tr>
			    	<td style="text-align: left;">
			    		<a>选择:</a><a href="#">全选</a><a>&nbsp;—&nbsp;</a><a href="#">反选</a>
			    		<input type="button" value=" 删  除 "><input type="button" value="添加">
			    	</td>
			    </tr>
			    <tr>
				    <td width="100%">
					    <table border="0" cellpadding="3" cellspacing="1" width="100%" align="center" style="background-color: #464646;text-align: center;">
					    	<tr>
		                   	 	<td height="25" colspan="13" align="left" bgcolor="#aaaaaa"><p>开设课程列表</p></td>
		                    </tr>
					    	<tr style="background: #dddddd; font-weight: bold">
							    <td width="60px">选择</td>
							    <td width="250px">课程名</td>
							    <td width="180px">课程类型</td>
							    <td width="150px">教师</td>
							    <td width="150px">开设时间</td>
							    <td width="150px">课程状态</td>
								<td width="150px">选课人数</td>
							</tr>
							 <s:iterator value="courseDetails" id="courseDetail">
							<tr bgcolor='#ffffff'>
							    <td><input type="checkbox" /></td>
								<td><s:property value="#courseDetail.course.courseName"/></td>
								<td><s:property value="#courseDetail.course.courseType.courseTypeName"/></td>
								<td><s:property value="#courseDetail.teacher.userName"/></td>
								<td><s:property value="#courseDetail.establishDate"/></td>
								<td>
									<s:if test="#courseDetail.state==1">
										开通
									</s:if>
									<s:else>
										结束
									</s:else>
								</td>
								<td>&nbsp;</td>
							</tr>
							</s:iterator>
					    </table>
				    </td>
			    </tr>
			     <tr id="bottom">
			    	<td class="bottom_left">
			    		<div class="bottom_left">共&nbsp;
			    			<span>
			    				<s:property value="totalPageCounts"/>
			    			</span>&nbsp;页&nbsp;|&nbsp;第&nbsp;
			    			<span>
			    				<s:property value="currentPage"/>
			    			</span>&nbsp;页&nbsp;|&nbsp;共&nbsp;
			    			<span>
			    				<s:property value="totalRecordCounts"/>
			    			</span>&nbsp;条记录</div>
			    		<div class="bottom_right">
			    		[&nbsp;<a href="listCourseDetail?currentPage=1">首页</a><span>|</span>
			    		<a href="listCourseDetail?currentPage=<s:property value="currentPage-1"/>">上一页</a><span>|</span>
			    		<a href="listCourseDetail?currentPage=<s:property value="currentPage+1"/>">下一页</a><span>|</span>
			    		<a href="listCourseDetail?currentPage=<s:property value="totalPageCounts"/>">末页</a>
			    		&nbsp;]&nbsp;转至:<input type="text" size="1" />
			    		<input type="button" value="Go">
			    		</div>
			    	</td>
			    </tr>	
		    </table>
		    </div>
		    <div class="bottomdown"></div>
	    </div>
	    
    </div>
  </body>
</html>
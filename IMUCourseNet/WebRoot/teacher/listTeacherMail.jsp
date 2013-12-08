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
    
    <title>内大教学网-Teaching&&Learning@IMU</title>
    
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
		    		<a>收信箱</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div class="lie">
		    	<div style="padding-top:15px;text-align:left;">
		    	<a>我的信箱（共<a><s:property value="totalRecordCounts"/></a>）封</a></div>
		    	<div id="mail">
		    		<table cellpadding="0" cellspacing="0" width="1100" align="center" class="mailtab">
			    		<tr style="font-size:20px;font-weight:bold;background:#aaaaaa;">
			    			<td width="60px"><input type="checkbox" /></td>
			    			<td width="800px">标题</td>
			    			<td width="200px">时间</td>
			    			<td width="140">操作</td>
			    		</tr>
			    		<s:iterator value="letters" id="letter">
			    		<tr onmouseover="this.style.backgroundColor='#cccccc';" onmouseout="this.style.backgroundColor='';">
			    		<td><input type="checkbox" /></td>
			    		<td><a href="showMailDetail?letterId=<s:property value="#letter.letterId"/>" style="text-align:left;"><s:property value="#letter.title"/></a></td>
			    		<td><a href="showMailDetail?letterId=<s:property value="#letter.letterId"/>"><s:date name="#letter.date" format="yyyy-MM-dd HH:mm:ss"/></a>
			    		</td><td><span><a href="deleteLetter?letterId=<s:property value="#letter.letterId"/>">删除</a></span></td>
			    		</tr>
			    		</s:iterator>
			    		
		    		</table>
		    	</div>
		    <div class="bottom" style="margin-left:50px;margin-top:10px;width:1000px;">
			    <div class="bottom_left">共&nbsp;<span>4</span>&nbsp;页&nbsp;|&nbsp;第&nbsp;<span>4</span>&nbsp;页&nbsp;|&nbsp;共&nbsp;<span>17</span>&nbsp;条记录</div>
			    <div class="bottom_right">
				    [&nbsp;<a href="#">首页</a><span>|</span>
				    <a href="#">上一页</a><span>|</span>
				    <a href="#">下一页</a><span>|</span>
				   	<a href="#">末页</a>&nbsp;]&nbsp;转至:<input type="text" size="1" /><input type="button" value="Go">
				</div>	
		    </div>
			</div>
	    	<div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

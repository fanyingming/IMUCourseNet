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
    
    <title>My JSP 'post.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" type="text/css" href="css/detail.css">
  </head>
  
  <body>
  <div class="zhu">
	    <div id="top">
	    	<div class="top_wordbg">
		    	<div class="top_wor">
		    		<a>讨论板</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div class="lie">
		    	<div style="padding-top:15px;text-align:left;">
				 <a href="WritePost.jsp">发帖</a></div>
		    	
		    	<div  class="tabhead">
		    		<table border="0" cellpadding="0" cellspacing="0" width="1100" align="center" class="tietab">
		    		<tr style="background: #dddddd; font-weight: bold;font-size:22px;">
		    			<td width="100px">回复</td>
		    			<td width="500px">内容</td>
		    			<td width="200px">作者</td>
		    			<td width="100px">浏览</td>
		    			<td width="200px">最后发表</td>
		    		</tr>
		    		</table>
		    	</div>
		    	<div  class="tabcontent">
		    		<table width="1100" align="center" cellpadding="0" cellspacing="0" style="text-align: center;border-top:#888888 1 solid;border-bottom:#888888 1 solid;">
		    		<s:iterator value="posts" id="post">
									 <tr onmouseover="this.style.backgroundColor='#cccccc';" onmouseout="this.style.backgroundColor='';">
										<td width="100px"><s:property value="#post.replyCounts" /></td>
										<td width="500px" style="text-align:left;"><div><a href="replypost?postId=<s:property value="#post.postId" />"><s:property value="#post.title" /></a></div></td>
										<td width="200px"><a><s:property value="#post.user.userName" /></a><br><time><s:property value="#post.editDate" /></time></td>
										<td width="100px"><s:property value="#post.checkCounts" /></td>
										<td width="200px"><a>qing</a><br><time></time></td>
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

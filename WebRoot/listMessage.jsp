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
		    		<a>留言信息</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
		    <div id="mtop">
		    	<div class="mtop_num"><a>共有<span><s:property value="totalRecordCounts"/></span>条留言</a></div>
		    </div>
			<s:iterator value="messages" id="message">
		    <div id="messages">
		    	<div class="messages_name">
		    	<a><s:property value="#message.user.userName"/></a><span>
				<s:if test="#session.level == 'admin'">
				<a href="deleteMessage?messageId=<s:property value="#message.messageId"/>"><img src="index-images/detele.jpg"></a></span>
				</s:if>
		    	</div>
		    	<hr width=860px size=1 noshade>
		    	<div class="messages_content">
					<s:property value="#message.content"/>
				</div>
		    	<div class="messages_buttom"><a><s:date name="#message.editDate" format="yyyy-MM-dd HH:mm:ss"/></a></div>
		    </div>
			 </s:iterator> 
		   	<div class="bottom_left" style="margin-left:110px;">
		   	共&nbsp;<span>
		   				<s:property value="totalPageCounts"/>
		   			</span>&nbsp;页&nbsp;|&nbsp;
		   			第&nbsp;<span><s:property value="currentPage"/></span>&nbsp;
		   			页&nbsp;|&nbsp;共&nbsp;
		   			<span>
		   				<s:property value="totalRecordCounts"/>
		   			</span>&nbsp;条记录</div>
			    <div class="bottom_right" style="margin-right:90px;">
			    [&nbsp;<a href="listMessage?currentPage=1">首页</a><span>|</span>
			    <a href="listMessage?currentPage=<s:property value="currentPage-1"/>">上一页</a><span>|</span>
			    <a href="listMessage?currentPage=<s:property value="currentPage+1"/>">下一页</a><span>|</span>
			    <a href="listMessage?currentPage=<s:property value="totalPageCounts"/>">末页</a>
			    &nbsp;]&nbsp;转至:<input type="text" size="1" /><input type="button" value="Go">
			    </div>
			<form method="post"  action="adminAddMessage">
		    <div id="pl">
		    	<div class="pl_top"><p><a>欢迎评论</a></p>
		    	<p id="mid"><textarea name="content" cols="105" rows="10"></textarea></p>
		    	</div>
		    	<div class="pl_bot">
		    	<input type="submit" value="提交" style="font-size:18px;"/>
		    	</div>
		    </div>
			</form>
	     	<div class="bottomdown"></div>
	    </div>
	</div>
  </body>
</html>

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
    
    <title>inMessage</title>
    
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
		    	<div class="mtop_num"><a>共有<span><s:property value="messageNum"/></span>条留言</a></div>
		    </div>
			<s:iterator value="messages" id="message">
		    <div id="messages">
		    	<div class="messages_name">
		    	<a><s:property value="#message.user.userName"/></a>
		    	</div>
		    	<hr width=860px size=1 noshade>
		    	<div class="messages_content">
					<s:property value="#message.content"/>
				</div>
		    	<div class="messages_buttom"><a>
		    	<s:date name="#message.editDate" format="yyyy-MM-dd HH:mm:ss"/>
		    	</a></div>
		    </div>
			 </s:iterator> 
		   <form method="post"  action="addMessage">
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

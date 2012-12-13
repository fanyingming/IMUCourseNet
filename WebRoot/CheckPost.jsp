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
    
    <title>My JSP 'CheckPost.jsp' starting page</title>
    
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
		    		<a>帖子信息</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
		    <div id="mtop">
		    	<div class="mtop_num"><a>共有<span><s:property value="post.replyCounts" /></span>条跟帖</a></div>
		    	
		    </div>
		    <div id="messages">
		    	<div class="messages_name">
		    	<a><s:property value="post.user.userName" /></a><span><a><img src="index-images/detele.jpg"></a></span>
		    	</div>
		    	<hr width=860px size=1 noshade>
		    	<div class="messages_content"><a><s:property value="post.content" /></a></div>
		    	<div class="messages_buttom"><a><s:property value="post.editDate" /></a></div>
		    </div>
		    
		    <s:iterator value="Postreplys" id="Postreply">
		     <div id="messages">	
		    	<div class="messages_name">
		    	<a><s:property value="#Postreply.user.userName" /></a>
				<!--
				<span>				
					<a><img src="index-images/detele.jpg"></a>
				</span>
				-->
		    	</div>
		    	<hr width=860px size=1 noshade>
		    	<div class="messages_content"><a><s:property value="#Postreply.content" /></a></div>
		    	<div class="messages_buttom"><span><a>3楼</a></span><a><s:property value="#Postreply.editDate" /></a></div>
		    	
		      </div>
		      </s:iterator>
		    <div id="pl">
		        <form name="form1" method="post" action="addPost">
		    	<input type="hidden" name="postId" value="<s:property value="post.postId" />"/>
		    	<div class="pl_top"><p><a>发表回复</a></p>
		    	<p id="mid"><textarea name="postReply" cols="105" rows="10"></textarea></p>
		    	</div>
		    	<div class="pl_bot">
		    	<input type="submit" value="发表" style="font-size:18px;"/>
		    	</div>
		    	</form>
		    </div>
		    <div class="bottomdown"></div>
		    <s:debug/>
		</div>
	</div>
  </body>
</html>
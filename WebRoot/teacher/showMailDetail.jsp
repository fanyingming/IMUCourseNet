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
    
    <title>inMail</title>
    
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
		    		<a>查看信件</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div id="mailinfo">
	    		<div class="mailinfo_left">
	    		<form name="fom" id="fom" method="post" action="">
	    		<input type="button"  value="<<返回" onclick= "fom.action='teacher/listTeacherMail';fom.submit(); " style="font-size:17px;"/>
	    		
	    		<input type="button" value="删除" style="font-size:17px;"/>
	    		</form>
	    		</div>
	    		<div class="mailinfo_right">
	    		<a href="">上一封</a><a href="">下一封</a>
	    		</div>
	    	</div>
	    	<div id="mailcontent">
	    		<div class="mailcontent_top">
	    		<br><a><s:property value="letter.title"/></a><br>
	    		<div class="mailcontent_top_right"><span>时间：</span><span><s:date name="letter.date" format="yyyy-MM-dd HH:mm:ss"/></span></div>
	    		</div>
	    		<div class="mailcontent_bottom">
	    			<div id="mailbottom">
	    			<p><a><s:property value="letter.content"/></a></p>
	    			</div>
	    		</div>
	    	</div>
	    	<div id="mailinfo">
	    		<div class="mailinfo_left">
	    		<input type="button" value="<<返回" onclick= "fom.action='teacher/listTeacherMail';fom.submit(); " style="font-size:17px;"/>
	    		<input type="button" value="删除" style="font-size:17px;"/>
	    		</div>
	    		<div class="mailinfo_right">
	    		<a href="">上一封</a><a href="">下一封</a>
	    		</div>
	    	</div>
	    	<div class="bottomdown"></div>
	    </div>
	    
	</div>
  </body>
</html>

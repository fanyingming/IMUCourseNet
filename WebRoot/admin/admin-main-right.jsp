<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
		    		<a>修改学生信息</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div class="medium_content">
		    <table class="medium_content_tabal1">
			    <tr>
			    	<td style="text-align: left;">
			    		<a>选择:</a><a href="#">全选</a><a>&nbsp;—&nbsp;</a><a href="#">反选</a>
			    		<input type="button" value=" 删  除 "><input type="button" value="添加学生">
			    	</td>
			    </tr>
			    <tr>
				    <td width="100%">
					    <table border="0" cellpadding="3" cellspacing="1" width="100%" align="center" style="background-color: #464646;text-align: center;">
					    	<tr>
		                   	 	<td height="25" colspan="13" align="left" bgcolor="#aaaaaa"><p>学生列表</p></td>
		                    </tr>
					    	<tr style="background: #dddddd; font-weight: bold">
							    <td width="60px">选择</td>
							    <td width="150px">学号</td>
							    <td width="180px">姓名</td>
							    <td width="250px">专业</td>
							    <td width="100px">年级</td>
							    <td width="250px">学院</td>
							</tr>
							<tr bgcolor='#ffffff'>
							    <td><input type="checkbox" /></td><td>00947001</td><td>haihai</td><td>软件工程</td><td>2009级</td><td>计算机学院</td>
							</tr>
							<tr bgcolor='#ffffff'>
							    <td><input type="checkbox" /></td><td>00947002</td><td>张三</td><td>生物工程</td><td>2010级</td><td>生命科学学院</td>
						    </tr>
						    <tr bgcolor='#ffffff'>
							    <td><input type="checkbox" /></td><td>00947002</td><td>张三</td><td>生物工程</td><td>2010级</td><td>生命科学学院</td>
						    </tr>
						    <tr bgcolor='#ffffff'>
							    <td><input type="checkbox" /></td><td>00947002</td><td>张三</td><td>生物工程</td><td>2010级</td><td>生命科学学院</td>
						    </tr>
						    <tr bgcolor='#ffffff'>
							    <td><input type="checkbox" /></td><td>00947002</td><td>张三</td><td>生物工程</td><td>2010级</td><td>生命科学学院</td>
						    </tr>
					    </table>
				    </td>
			    </tr>
			    <tr id="bottom">
			    	<td class="bottom_left">
			    		<div class="bottom_left">共&nbsp;<span>4</span>&nbsp;页&nbsp;|&nbsp;第&nbsp;<span>4</span>&nbsp;页&nbsp;|&nbsp;共&nbsp;<span>17</span>&nbsp;条记录</div>
			    		<div class="bottom_right">
			    		[&nbsp;<a href="#">首页</a><span>|</span>
			    		<a href="#">上一页</a><span>|</span>
			    		<a href="#">下一页</a><span>|</span>
			    		<a href="#">末页</a>&nbsp;]&nbsp;转至:<input type="text" size="1" /><input type="button" value="Go">
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
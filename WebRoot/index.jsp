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
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	
	<script type="text/javascript" src="js/jquery.pack.js"></script>
	<script type="text/javascript" src="js/jQuery.blockUI.js"></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
  </head>
  
  <body>
  <div id="main">
     <div id="head1"><!-- 头部标题-->
     	<div class="head1_right">
	     <a href="index.jsp" target="_blank">首页</a>
	     <a href="news.jsp"  target="_blank">新闻通知</a>
	     <a href="#">内大课程</a>
	     <a href="#">院系应用</a>
	     <a href="#">下载专区</a>
     	</div>     
   	</div>
  <div>
   <img src="images/ad2.jpg" width="900" height="290" />
   </div>	
   <div id="lef1">
	   <table class="lef1_table1">
		   <tr>
		   <td>
				<table class="lef1_table1_tab1">
					<tr>
						<td style="background:#70c9d1;" width="150px" height="60px"><div id="change1"><a href="#" ><br>操作系统</a></div></td>
						<td style="background:#c5d616;" width="150px" height="60px"><div id="change2"><a href="#"><br>软件测试</a></div></td>
						<td style="background:#f9b52c;" width="150px" height="60px"><div id="change3"><a href="#"><br>人机交互</a></div></td>
					</tr>
					 <tr>
						<td style="background:#70c938;" height="60px"><div id="change4"><a href="#"><br>网络信息安全</a></div></td>
						<td style="background:#e76b21;" height="60px"><div id="change5"><a href="#"><br>网络安全</a></div></td>
						<td style="background:#ff4da6;" height="60px"><div id="change6"><a href="#"><br>编译原理</a></div></td>
				    </tr>
				</table>
			</td>
			<td>
			<form action="login" method="post">
			<table class="lef1_table1_tab2">
				<tr>
					<td width="110px" height="40px" id="a1"><a >用户名</a></td>
					<td ><input type="text" name="userAccount" tabindex="1" id="inpu1"></td>
					<td rowspan=2 width="130px">
					<input type="submit" value="登录"  id="inpu2" tabindex="3" />
					<br><a href="#" tabindex="4" style="font-size:21px;">忘记密码？</a>
					</td>
				</tr>
				<tr>
					<td width="110px" height="40px" id="a1"><a >密&nbsp;&nbsp;&nbsp;码</a></td>
			   		<td ><input type="password" name="userPass" id="inpu1" tabindex="2"></td>
				</tr>
				<tr>
			    	<td colspan=3 height="39px" id="td1"><a class="a2">有问题请联系：ndjsw@imu.edu.cn</a></td>
			    </tr>
			</table>
			</form>
			</td>
		  </tr>
	   </table>
   </div>
   <div id="content">
   		<div class="content_left">
   			<p><img src="images/news.jpg" /><a style="margin-left:235px;">&nbsp;</a><a href="#">more>></a></p>
   			<div id="news">
   				<div class="news_left">
   					<div class="slideBox">
						<div class="hd">
							<ul><li>1</li><li>2</li><li>3</li></ul>
						</div>
						<div class="bd">
							<ul>
								<li><img src="images/new3.jpg" /></li>
								<li><img src="images/n2.jpg" /></li>
								<li><img src="images/n3.jpg" /></li>
							</ul>
						</div>
					</div>
				<script type="text/javascript">jQuery(".slideBox").slide( { mainCell:".bd ul",effect:"leftLoop",autoPlay:true} );</script>
   				</div>
   				<div class="news_right">
   				
   					<s:action name="indexPageListNews" executeResult="false" var="news"/>
   					<s:set value="#news.getNews()" name="newsList"/>
   					<s:iterator value="#newsList" id="new">
   					
   					<p><a href="news.jsp"><s:property value="new"/></a></p>
   					
   					</s:iterator> 
   					
   				</div>
   			</div>
   		</div>
   		<div class="content_right">
   		<p><img src="images/notes.jpg" /><a style="margin-left:215px;">&nbsp;</a><a href="#">more>></a></p>
			<div class="content_right_down">
				<div id="marquees">
					<div class="topLoop" style="width:425px">
						<div class="hd">
							<a class="next"></a>
							<a class="prev"></a>
						</div>
						<div class="bd">
							<ul>
								<li><span class="date">2011-11-11</span><a href="">中国打破了世界软件巨头规则</a></li>
								<li><span class="date">2011-11-11</span><a href="">口语：会说中文就能说英语！</a></li>
								<li><span class="date">2011-11-11</span><a href="">农场摘菜不如在线学外语好玩</a></li>
								<li><span class="date">2011-11-11</span><a href="">数理化老师竟也看学习资料？</a></li>
								<li><span class="date">2011-11-11</span><a href="">学英语送ipad2,45天突破听说</a></li>
								<li><span class="date">2011-11-11</span><a href="">学外语，上北外！</a></li>
								<li><span class="date">2011-11-11</span><a href="">学外语，上北外！</a></li>
								<li><span class="date">2011-11-11</span><a href="">学外语，上北外！</a></li>
								<li><span class="date">2011-11-11</span><a href="">学英语送ipad2,45天突破听说</a></li>
							</ul>
						</div>
					</div>

				</div>
				<script type="text/javascript">jQuery(".topLoop").slide({ mainCell:".bd ul",effect:"topMarquee",vis:8,interTime:50,autoPlay:true});</script>

			</div>
   		</div>
   	</div>
   	</div> 
   	<div id="main">
   	<div id="good">
   		<div class="good_jing">
   			<p><img src="images/good.jpg"/><a href="#" style="margin-left:700px;text-decoration:none;">more>></a></p>
   		</div>
		<div class="effect" style="width:910px">
					<div id="leftMarquee" class="leftLoop">
						<div class="bd">
							<ul class="picList">
								<li>
									<div class="pic"><a href=""><img src="images/1.jpg" /></a></div>
								</li>
								<li>
									<div class="pic"><a href=""><img src="images/2.jpg" /></a></div>
								</li>
								<li>
									<div class="pic"><a href=""><img src="images/3.jpg" /></a></div>
								</li>
								<li>
									<div class="pic"><a href=""><img src="images/4.jpg" /></a></div>
								</li>
								</li>
								<li>
									<div class="pic"><a href=""><img src="images/2.jpg" /></a></div>
								</li>
							</ul>
						</div>
					</div>
			<script type="text/javascript">jQuery("#leftMarquee").slide({ mainCell:".bd ul",effect:"leftMarquee",vis:4,interTime:50,autoPlay:true });</script>
		</div>

   	
	   <div id="links">
	   <hr width="900px" size=4 noshade>
	   		<div class="links_pic">
			  <a href="http://www.flagnet.net/" target="_blank"><img src="images/flagnet.jpg" /></a>
		  	  <a href="http://job.imu.edu.cn/" target="_blank"><img src="images/imujob.jpg" /></a>
		  	  <a href="http://jwxt.imu.edu.cn/" target="_blank"><img src="images/urp.jpg" /></a>
		  	  <a href="http://www.nm.zsks.cn/" target="_blank"><img src="images/zsks.jpg" /></a>
		  	  <a href="http://xscx.flagnet.net/" target="_blank"><img src="images/cxpt.jpg" /></a>
		  	  <a href="http://www.imu.edu.cn/" target="_blank"><img src="images/imuedu.jpg" /></a>
			</div>
		<hr width="900px" size=4 noshade>
	   </div>
   		<div id="copy">
   		<p><a>Copyright&copy;2012 内蒙古大学版权所有</a></p>
   		<p><a href="#">关于内大教学网</a><a href="#">服务条款</a><a href="#">帮助中心</a><a href="#">友情链接</a><a href="#">联系我们</a></p>
   		</div>
    </div>
    </div>
  
  </body>
</html>

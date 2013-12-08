<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/detail.css">
	<SCRIPT language=JavaScript>
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}
</SCRIPT>
  </head>
  
  <body>
  
  <div class="zhu">
	    <div id="top">
	    	<div class="top_wordbg">
		    	<div class="top_wor">
		    		<a>查看管理员</a>
		    	</div>
		    </div>
	    </div>
	    <div id="medium">
	    	<div class="medium_content">
	    	<form name="fom" id="fom" method="post" action="">
		    <table class="medium_content_tabal1">
			    <tr>
			    	<td style="text-align: left;">
			    		<a>选择:</a>
			    		<a href="javascript:void(0);"  onClick="selectAll();">全选</a><a>&nbsp;—&nbsp;</a>
			    		<a href="javascript:void(0);"  onClick="unselectAll();">反选</a>
			    		<input type="button" value=" 删  除 ">
			    		<input type="button" value=" 添 加 " onclick= "fom.action='admin/addAdmin.action';fom.submit(); ">
			    	</td>
			    </tr>
			    <tr>
				    <td width="100%">
					    <table border="0" cellpadding="3" cellspacing="1" width="100%" align="center" style="background-color: #464646;text-align: center;">
					    	<tr>
		                   	 	<td height="25" colspan="13" align="left" bgcolor="#aaaaaa"><p>管理员列表</p></td>
		                    </tr>
					    	<tr style="background: #dddddd; font-weight: bold">
							      <td width="40">选择</td>
									<td width="71" height="24">编号</td>
									<td width="180">用户名</td>
									<td width="180">密码</td>
									<td width="100">姓名</td>
									<td width="220">邮箱</td>
									<td width="200">部门</td>
									<td width="110">操作</td>
							</tr>
							 <s:iterator value="admins" id="admin">
					    <tr style="background:#ffffff;">
					      <td><input type="checkbox" name="delid"/></td>
					      <td><s:property value="#admin.userId"/></td>
					      <td><s:property value="#admin.userAccount"/></td>
					      <td><s:property value="#admin.userPass"/></td>
					      <td><s:property value="#admin.userName"/></td>
					      <td><s:property value="#admin.userMail"/></td>
					      <td><s:property value="#admin.department.departmentName"/></td>
					      <td>
					      	<a href="deleteUser.action?userId=<s:property value="#admin.userId"/>">删除 </a>
								&nbsp;&nbsp;
							<a href="beforeUpdateAdmin.action?userId=<s:property value="#admin.userId"/>">修改</a></td>
					    </tr>
					    </s:iterator>
					    </table>
					     </table>
					  </form>
					  
				    <td></td>
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
			    		[&nbsp;<a href="listAdmin?currentPage=1">首页</a><span>|</span>
			    		<a href="listAdmin?currentPage=<s:property value="currentPage-1"/>">上一页</a><span>|</span>
			    		<a href="listAdmin?currentPage=<s:property value="currentPage+1"/>">下一页</a><span>|</span>
			    		<a href="listAdmin?currentPage=<s:property value="totalPageCounts"/>">末页</a>
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

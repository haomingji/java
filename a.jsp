<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath() + "/";
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
   .error{
   color: red;
   }
</style>
</head>
<body>
<form action="b.jsp" id="aa">

用户名:<input name="name" /><br/>
密码:<input type="password" name="password" id="password"/><br/>
确认密码:<input type="password" name="password1"/><br/>
<input type="submit" value="提交">
</form>



<script type="text/javascript" src="plugins/jquery/jquery.min.js"></script>
<script type="text/javascript" src="plugins/validate/jquery.validate.min.js"></script>
<script type="text/javascript" src="plugins/validate/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$("#aa").validate({
		rules:{
			name:{
				required:true
			},
			password:{
				required:true
			},
			password1:{
				required:true,
				equalTo:"#password" 
			}
		},
		messages:{
			name:{
				required:"必填"
			},
			password:{
				required:"必填"
			},
			password1:{
				required:"必填",
				equalTo:"两次输入的密码必须一致"
			}
		}
	}
			
	
	);
});



</script>
</body>
</html>
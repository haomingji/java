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
<title>闭包</title>
</head>
<body>
<script type="text/javascript">
var demo=function(){
	var age;
	return {
		age:18,
		show:function(){
			alert(age);
		},
		setage:function(a){
			age=a;
		}
	}
	
}();
var show=function(){
	demo.setage(22);
	demo.show();
}
</script>
<input type="button" value="提交" onclick="show()">
</body>
</html>
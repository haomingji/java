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
</head>
<body>
sdfsdsdfdsfsdfdsf

<script type="text/javascript" src="plugins/jquery/jquery.min.js"></script>
<script type="text/javascript" src="plugins/layer/layer.js"></script>

<script type="text/javascript">
$(function(){
	//初体验
	//layer.alert('内容');
	
	//询问框
	/*
	layer.confirm('您是如何看待前端开发？', {
	  btn: ['确定','取消'] //按钮
	}, function(){
	  layer.msg('的确很重要', {icon: 1});
	}, function(){
	  layer.msg('点击取消');
	});
	*/
	
	//layer.msg('提示信息');
	
	//iframe层-父子操作
	layer.open({
	  type: 2,
	  area: ['700px', '530px'],
	  fixed: false, //不固定
	  maxmin: true,
	  shade: 0.6,
	  content: 'jsp/h1.jsp'
	});
});
</script>
</body>
</html>
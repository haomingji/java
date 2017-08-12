<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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
<form action="UserinfoAdd.do" method="post" id="myform">
用户名:<input type="text" name="account"/><br>
真实姓名:<input type="text" name="realname"/><br>
<div>
性别:
     <input type="radio" name="sex" value="1">男
     <input type="radio" name="sex" value="0">女
     </div>
部门:<select name="department">
      <option value=""></option>
 <c:forEach items="${dep_list}" var="d">
 <option value="${d.id}">${d.department_name}</option>
 </c:forEach>

</select>
<div>
状态:  <input type="radio" name="stat" value="1">在职
     <input type="radio" name="stat" value="0">停职
    
     
</div>
<input type="submit" value="添加">
</form>
<script type="text/javascript" src="plugins/jquery/jquery.min.js"></script>
<script type="text/javascript" src="plugins/validate/jquery.validate.min.js"></script>
<script type="text/javascript" src="plugins/validate/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$("#myform").validate({
		rules:{
			account:{
				required:true,
				rangelength:[5,10]
			},
			realname:{
				required:true,
				rangelength:[2,4]
				
			},
			stat:"required",
			sex:"required",
			//department:"required"
		},
		
		/*
		 *error 错误信息元素
		 * $element 当前验证的元素
		 */
		errorPlacement: function(error, $element) {
			if($element.is(":radio")){
				$element.parent().append(error);
				//error.appendTo($element.parent());
			}else {
				$element.after(error);
			}
		    // 
		},
	});
});
</script>
</body>
</html>
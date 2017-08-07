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
<form action="userinfoAdd" id="myform" method="post">
账号：<input name="account"/><br/>
姓名：<input name="realname"/><br/>
<div>
性别：<input type="radio" name="sex" value="0">女
      <input type="radio" name="sex" value="1"> 男
      </div>
状态：<select name="stat" >
<option value=""></option>
<option value="0">冻结</option>
<option value="1">开启</option>
</select><br/>

<input type="submit" value="提交">

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
				rangelength:[5,10],
				remote:"userinfohasaccount.do"
			},
			realname:{
				required:true,
				rangelength:[2,4]
			},
			sex:{
				required:true
			},
			stat:{
				required:true
			}
		},
		messages:{
			account:{
				remote:"此账号已被占用！"
			}
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
		}
	
	});
});


</script>
</body>
</html>
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
<link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="plugins/bootstrap-table/bootstrap-table.css">
</head>
<body>
<div><a href="UserinfoAdd.do">添加用户</a></div>
<table id="tb"></table>
 
 <div  id="user_update" style="display:none">
   <ul >
    <li>用户名<input id="a1" ></li>
    <li>真实姓名<input id="a2" ></li>
    <li id="st">状态
           <input id="a4" type="radio" name="stat" value="1">在职
           <input id="a5" type="radio" name="stat" value="0">停职
           </li>
           <li >
           部门:<select name="department" id="dep">
               <option value=""></option>
          <c:forEach items="${dep_list}" var="dd">
              <option value="${dd.id}">${dd.department_name}</option>
          </c:forEach>

          </select>
          </li>
          </ul>
     
 </div>
<script type="text/javascript" src="plugins/jquery/jquery.min.js"></script>
<script type="text/javascript" src="plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="plugins/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript" src="plugins/bootstrap-table/ShxtTable.js"></script>
<script type="text/javascript" src="plugins/layer/layer.js"></script>
<script type="text/javascript">

$(function(){
	ShxtTable.init($("#tb"),{
		 url:"UserinfoList.do",
		 columns:[{
				field: "account",
				title: "用户名",
				halign: "center",
				align: "center",
				sortable: true
	       	},{
	       		field: "realname",
				title: "真实姓名",
				halign: "center",
				align: "center",
				sortable: true
	       	},{
	       		field: "stat",
				title: "状态",
				halign: "center",
				align: "center",
				cellStyle:statStyle,
				formatter:statformat,
				
				
	       	},{
	       		field: "sex",
				title: "性别",
				halign: "center",
				align: "center",
				formatter:sexformat
	       	},{
	       		field: "department_name",
				title: "部门",
				halign: "center",
				align: "center",
				
	       	},{
	       		title: "操作",
	       		formatter:operateFormatter,
	       		events:operateEvents
	       	}
		   ],
	});
});





function statformat(value,row,index){
	if(value=="0"){
		return("停职");
	}else if(value=="1"){
		return("在职");
	}
}
function sexformat(value,row,index){
	if(value=="0"){
		return("女");
	}else if(value=="1"){
		return("男");
	}
}
function operateFormatter(){
	//按钮的几种颜色:  btn-default 白,  btn-primary 蓝，  btn-success 绿  
	// 					btn-info 浅蓝， btn-warning 橘黄 btn-danger 红  btn-link 连接
	//按钮的大小： .btn-lg btn-sm btn-xs
    var s = [
        '<button class="like btn-default btn btn-xs glyphicon glyphicon-info-sign" title="测试"></button>',
        ' <button class="edit btn-default btn btn-xs  glyphicon glyphicon-edit"  title="编辑"></button>',
        ' <button class="remove btn-default btn btn-xs glyphicon glyphicon-remove" title="删除"></button>'
    ];
    
    return s.join('');
}
function statStyle(value,row,index){
	if(value=="0"){
		return {
			css:{'color':'red'}
		};
	}else if(value=="1"){
		return {
			css:{'color':'green'}
		};
	}else{
		return "";
	}
}

window.operateEvents = {
	    'click .like': function (e, value, row, index) {
	    	//location.href="del.do?id=" +row.id; 
	        //alert('You click like action, row: ' + JSON.stringify(row));
	    },
	    'click .edit': function (e, value, row, index) {
	 $.post("UserinfoEdit.do",{id:row.id},function(){
		 
			$("#a1").val(row.account);
	    	$("#a2").val(row.realname);
    		$("#st :radio").val([row.stat]);
    		$("#dep").val('${userinfo.department_id}');
	 });
	    

	    	
	    	layer.open({
	    		type: 1,
	            title: '修改用户信息',
	    		maxmin: true, 
	    		shadeClose:false, //点击遮罩关闭层
	            area : ['800px' , ''],
	            content:$('#user_update'),
	    		btn:['提交','取消'],
	    		yes:function(index,layero){	
	    		
	    	          $.post("UserinfoEdit1.do",{id:row.id,account:$("#a1").val(),realname:$("#a2").val(),stat:$("#st").val()},function(){
	    	        	  
	    	          });

	          	 layer.alert('修改成功！',{
	                 title: '提示框',				
	  			icon:1,		
	  			  });
	          	layer.close(index);	
	  			ShxtTable.refresh();
	  		}
	    
	    		});
	   },
	    'click .remove': function (e, value, row, index) {
	    	var index = layer.msg("您确定删除么？", {
	    		btn:['确定','取消'],
	    		yes : function(){
	    			$.post("UserinfoDelete.do",{id:row.id},function(){
	    				 ShxtTable.refresh();
	    			});
	    			
	    			
	    			layer.close(index);
	    			
	    		}
	    	});
	    	
	    	
	    },
	};
</script>
</body>
</html>
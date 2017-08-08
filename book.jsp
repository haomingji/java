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
<link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="plugins/bootstrap-table/bootstrap-table.css">
</head>
<body>
<table id="tb"></table>
 <div  id="user_update" style="display:none">
   <ul >
    <li>用户名<input id="a1" ></li>
    <li>真实姓名<input id="a2" ></li>
    <li>电话号<input id="a3" ></li>
    <li>状态<input id="a4" type="radio" name="stat" value="1">在职
           <input id="a5" type="radio" name="stat" value="0">停职
           </li>
     </ul>
 </div>
<script type="text/javascript" src="plugins/jquery/jquery.min.js"></script>
<script type="text/javascript" src="plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="plugins/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript" src="plugins/layer/layer.js"></script>
<script type="text/javascript">
$(function(){
	$("#tb").bootstrapTable({
		
		/******************************【基本】****************************************************/
       url:"BookList.do",
	   striped:true,
	   columns:[{
			field: "user_name",
			title: "用户名",
			halign: "center",
			align: "center",
			sortable: true
       	},{
       		field: "user_true_name",
			title: "真实姓名",
			halign: "center",
			align: "center",
			sortable: true
       	},{
       		field: "user_phone",
			title: "电话",
			halign: "center",
			align: "center",
			sortable: true
       	},{
       		field: "user_stat",
			title: "状态",
			halign: "center",
			align: "center",
			cellStyle:statStyle,
			formatter:statformat,
			
			
       	},{
       		field: "user_sex",
			title: "性别",
			halign: "center",
			align: "center",
			formatter:sexformat
       	},{
       		title: "操作",
       		formatter:operateFormatter,
       		events:operateEvents
       	}
	   ],
	   /*****************************【显示】*****************************************************/
		undefinedText : "",	//['-'] 当数据为 undefined 时显示的字符
		/****************************【排序】******************************************************/
		sortName: "user_id",	//[undefined] 定义排序列,通过url方式获取数据填写字段名，否则填写下标
		sortOrder : "desc",	//['asc'] 定义排序方式 'asc' 或者 'desc'
		/****************************【分页】******************************************************/
		pagination: true, //[false] 设置为 true 会在表格底部显示分页条
		pageSize: 3,//[10] 如果设置了分页，页面数据条数
		/*Array [10, 25, 50, 100, All]如果设置了分页，设置可供选择的页面数据条数。
		设置为All 则显示所有记录。*/
		pageList: [3, 5, 10, 25, 50, 100, 'All'], 
		/*****************************【搜索】*****************************************************/
		search: true,//[false]是否启用搜索框
		/*****************************【下拉框】*****************************************************/
		showColumns: true,//[false]是否显示 内容列下拉框
		
       a:true
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
	    	$.post("UserList.do",{user_id:row.user_id},function(data){
	    		$("#a1").val(data[0].user_name);
	    		$("#a2").val(data[0].user_true_name);
	    		$("#a3").val(data[0].user_phone);
	    		if($("#a4").val()==data[0].user_stat){
	    			$("#a4").attr("checked",true);
	    		}
	    		else if($("#a5").val()==data[0].user_stat){
	    			$("#a5").attr("checked",true);
	    		}
	    	},"json");
	    	layer.open({
	    		type: 1,
	            title: '修改用户信息',
	    		maxmin: true, 
	    		shadeClose:false, //点击遮罩关闭层
	            area : ['800px' , ''],
	            content:$('#user_update'),
	    		btn:['提交','取消'],
	    		yes:function(index,layero){	
				 	
	    	          
	          	  $.post("UserUpdate.do",{user_id:row.user_id,user_name:$("#a1").val(),user_true_name:$("#a2").val(),user_phone:$("#a3").val(),user_stat:$(":checked").val()},function(data){
	          	 },"json");
	          	 layer.alert('修改成功！',{
	                 title: '提示框',				
	  			icon:1,		
	  			  });
	          	layer.close(index);	
	  			 $("#tb").bootstrapTable('refresh', {url:"BookList.do"});
	  		}
	    
	    		});
	      
	       
	      
	    },
	    'click .remove': function (e, value, row, index) {
	    	var index = layer.msg("您确定删除么？", {
	    		btn:['确定','取消'],
	    		yes : function(){
	    			/* $table.bootstrapTable('remove', {
	    	            field: 'id',
	    	            values: [row.id]
	    	        }); */
	    			
	    			
	    			refreshTable();
	    			
	    			
	    			layer.close(index);
	    		}
	    	});
	    	
	    	
	    },
	};
</script>
</body>
</html>
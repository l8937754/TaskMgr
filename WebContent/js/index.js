$(function(){
	//页面加载完成之后执行
	pageInit();
});
function pageInit(){
	//创建jqGrid组件	
	//alert($(":input[name='custid']").val());
	  
	jQuery("#tlist").jqGrid(
			{								
				url :"TaskMgr/task_tasklist.action",//组件创建完成之后请求数据的url
				postData:{custid:$(":input[name='custid']").val(),xtid:$(":input[name='xtid']").val()},
				datatype : "json",//请求数据返回的类型。可选json,xml,txt  '功能名称','提出日期', '解决人','完成日期','是否完成','任务状态','提出人'
				colNames : [ "任务编号", "客户名称", "系统名称" ,"功能名称","问题描述","提出人","提出日期","解决人","完成日期","解决方法"],//jqGrid的列显示名字
				colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....				             
				             {name : "id",index : "id",width : 90}, 
				             {name : "customername",index : "customername",width : 100}, 
				             {name : "xtmc",index : "xtmc",width : 80,align : "right"},			            
				             {name : "gnmc",index : "gnmc",width : 80,align : "right"},
				             {name : "wtms",index : "wtms",width : 80,align : "right"},
				             {name : "tcr",index : "tcr",width : 80,align : "right"},
				             {name : "tcrq",index : "tcrq",width : 80,align : "right"},
				             {name : "jjr",index : "jjr",width : 80,align : "right"},
				             {name : "wcrq",index : "wcrq",width : 80,align : "right"},
				             {name : "jjff",index : "jjff",width : 80,align : "right"}
				           ],
				rowNum : 10,//一页显示多少条
				rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
				pager : '#pager2',//表格页脚的占位符(一般是div)的id
				sortname : 'id',//初始化的时候排序的字段
				jsonReader:{
					root:"rows",
					page:"page",
					total:"total",
					records:"records",
					repeatitems:false},
				sortorder : "desc",//排序方式,可选desc,asc
				type : "post",//向后台请求数据的ajax的类型。可选post,get
				viewrecords : true,
				reloadAfterSubmit:true,
				caption : "任务列表"//表格的标题名字
			});
	/*创建jqGrid的操作按钮容器*/
	/*可以控制界面上增删改查的按钮是否显示*/
	jQuery("#tlist").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
}
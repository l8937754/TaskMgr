$(document).ready(function(){
	$(":input").change(
	function(){	
		if ($(this).is("input")){
			//alert($(this).val());
		}
		//alert($(this).children("option:selected").val());
		//传递参数重新加载jqgrid
		$("#tlist").jqGrid("setGridParam",{datatype:"json",url:"TaskMgr/task_tasklist.action",
			postData:{custid:$(":input[name='custid']").val(),xtid:$(":input[name='xtid']").val()},
			type:"post"
		}).trigger("reloadGrid");
//		alert($(":input[name='custid']").val());
//			$.ajax({
//				url:"TaskMgr/task_tasklist.action",
//				async:true,//是否为异步请求
//				cache:false,//是否缓存结果
//				type:"GET",
//				data:{custid:"独山子",xtid:"%"},
//				dataType:"json",
//				success:function(resultdata){					
//					$("#tlist").jqGrid("clearGridData");
//					$("#tlist").jqGrid("setGridParam",{data:resultdata,datatype:"json"}).trigger("reloadGrid");
//				}
//			
//			})
		
	})
})
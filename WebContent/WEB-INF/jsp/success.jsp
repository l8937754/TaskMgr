<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mainfrm.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.treeview.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
       	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.treeview.js"></script>
    </head>
    <body>
    	<div style="height: 100%; width: 100%;">
			<div style="width: 100%;">
				
	 		  <div style="height: 30px;margin: 0 auto;line-height:30px;background-color:cornflowerblue;">
    			<span style="margin-left:50px ;">我的控制台</span>
    	  	  </div>
    	  	  
    		  <div class="index_head_im">
    			<div style="float: left;height: 100%;width:10%;background-image: url(ioc.png);background-repeat: no-repeat;background-size: 100% 100%;"></div>
    			<div style="float: left;background-image:url(${pageContext.request.contextPath}/images/heard-img.jpg) ;background-repeat: no-repeat;background-size:100% 100%;height: 100%;width: 90%;"></div>
    		  </div>
    		 
			</div>
			
    		<div >
    		<form id="cnode"  method="post">
    			<div class="left_menu">    			
					<ul id="tree">
						<li>主界面</li>
						<li>任务管理
							<ul>							 
								<li style="list-style:none;">任务列表</li>
								<li style="list-style:none;">任务统计</li>
							</ul>
						</li>
						<li>客户管理</li>
					</ul>
    			</div>
    		</form>	
    			<div style="height:60px;width:100%;">
    				<div><span>欢迎使用本系统！${session.userinfo.NAME }</span>
    					<div style="margin-right:100px;float:right;"><input type="button" value="退出系统"/></div>
    				</div>
    				<div><span style="font-color:#CCCCCC">上次登陆时间:${session.loglist[0].loginDateTime}</span></div>
    			</div>
    			
    			<div  style="height:200px;width:100%;">
    				<div style="height:200px;width:40%;float:left;">
    					<div style="float:left;"><img src=""/><span>待办事项</span></div>
    					<div style="float:right;"><input type="button" value="刷新"/><input type="button" value="更多"/></div>
    				</div>
    				<div style="height:200px;overflow:hidden;">
    					<div><span>ahnzwei</span></div>
    					
    					<table class="changetr">
    				    <c:forEach items="${noticelist }" var="notice">
    					<%-- noticelist是一个List《Notice》，返回notice是一个数组，如果用notice.Content访问会报错--%>
    				<%-- 	<tr><td><span>*</span>${notice[1]}</td></tr> --%>
    						<tr ><td><span>*</span>${notice.changenotice}</td></tr>
    					</c:forEach>
    					</table>
    					
    				</div>
    			</div>
    			
    			<div  style="height:200px;background-color:blanchedalmond;">

    			</div>
    		</div>
    		
    	</div>
    	
 	</body>
        <script type="text/javascript">
			 	$(document).ready(function(){
					$(".left_menu>ul>li").click(function(){
					$(this).children().toggle()
					});
				}); 
			 	
			 	$(document).ready(function(){
			 		
			 		$(".left_menu>ul>li>ul>li").click(function(){
			 			//alert($(this).text());
			 			
			 		   if ($(this).text()=="任务列表"){
			 			 
			 			  document.getElementById("cnode").action ="task_taskform.action";
			 			  document.getElementById("cnode").submit();
			 		   }
			 			event.cancelBubble =true;//取消冒泡事件
			 		});
			 	});
			 	
	 			$(document).ready(function(){
 	 				$(".changetr tr").click(function(){
 	 					$(this).parent().find("tr.focus").toggleClass("focus");
 	 					$(this).toggleClass("focus");
 	 				});		
	 			});				
       </script>	
</html>
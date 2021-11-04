<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mainfrm.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery-ui-1.8.16.custom.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ui.jqgrid.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.jqGrid.src.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/js/index.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/js/grid.locale-cn.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/selectchange.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/My97DatePicker/WdatePicker.js"></script>   
<title>任务管理系统</title>
</head>
<body>
<div style="background-color:#CED9E7;"><span>任务管理</span></div>
<div class="tasklist-head">
	<form action="task_tasklist.action" method="post">
    <ul>
    <span>客户名称</span>  
     <li >
     <select name="custid">
         <option value="%">所有客户</option>
        <c:forEach items="${customerlist}" var ="cust">
        	<option value="${cust.tvalue }">${cust.tvalue}</option>
        </c:forEach>
    </select>
    </li>
    <span>系统名称</span>
    <li>
		<select name="xtid">
			<option value="%">所有系统</option>			
				<c:forEach items="${xtmclist }" var="xtmc">
					<option value="${xtmc.tvalue }">${xtmc.tvalue }</option>
				</c:forEach>
			</select>
    </li>
    <li><span>任务状态</span>
    	<select name="sfwcid">
    		<option>所有状态</option>
    		<option value="Y">是</option>
    		<option value="N">否</option>
    	</select>
    </li>
    <li>
    	<span>解决人</span>
    	<select><option values="">aaaaaaaaaaa</option></select>
    </li>
    <li><span>任务状态</span>
    	<select name="rwztid">
    		<option value="%">所有状态</option>
    		<c:forEach items="${stateslist }" var="states">
    			<option value="${states.tvalue }">${states.tvalue }</option>
    		</c:forEach>
    	</select>
    </li>
    </ul>
	</form>
   <ul style="border:0px red solid">
   		<li>
   		 	<span>记录日期</span>
   		 	<input id="sdate" type ="text" class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"/> -
   			<input id="edate" type="text" class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"/>
   		</li>
   </ul> 
</div>
<div>
 <div style="width:70%;float:left;overflow-x:scroll;">
 <table id ="tlist">
 </table>
 <div id="pager2"></div>
 </div>
  <div style="width:30%;float:left;background-color:red;">
    <a href="">aaaaaaaaaaaa</a>  
  </div>
</div>
<div></div>

<script type="text/javascript"> 

</script> 

</body>
</html>
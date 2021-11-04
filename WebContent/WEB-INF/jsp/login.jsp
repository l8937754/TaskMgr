<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css"/>
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.cookie.js"/></script>
<title>Insert title here</title>
</head>
<body class="bg-image" onload="getCookie()">	
    <form action="${pageContext.request.contextPath}/user_login.action" class="login-frm" method="post">
        <div>
            <div><h3>用户登录</h3></div>
            <div>
               <span>用户名:</span><input id="logname" value="cao" type="text" name="LOGINNAME"/>
            </div><br/><br/>
            <div>
            	&nbsp;<span>密码:</span><input id="pwd" value="cao" type="password" name="PASSWORD"/>
            </div>
            <div style="font-color:red;"><s:actionerror/></div>
            <input type="checkbox" id="reme">:记住密码</imput>
            <br/>
            <div>&nbsp;&nbsp;<input style="width:130px;" type="submit" value="登录" onclick="tologin()"/></div>
        </div>
    </form>
</body>
<script type="text/javascript">
		function tologin(){
			var username = $("#logname").val();
			var pwd =$("#pwd").val();
			var chk = $("#reme").is(":checked");
			if (username==""){alert("请输入用户名呢");return;}
			if(pwd==""){alter("请输入密码");return;}
			if(chk==true){
				setCookie(username,pwd,chk);
			}else{
			 	setCookie("","",false);
			}
		}
		
		function setCookie(u,p,c){
			if(c==true){
				$.cookie("uname",u,{expires:7});
				$.cookie("pwd",p,{expires:7});
				$.cookie("reme","true",{expires:7});
			}else{
				$.cookie("uname","",{expires:-1});
				$.cookie("pwd","",{expires:-1});
				$.cookie("reme","false",{expires:-1});
			}	
		}
		function getCookie(){
			
			if($.cookie("reme")=="true"){
				$("#logname").val($.cookie("uname"));
				$("#pwd").val($.cookie("pwd"));
				$("#reme").attr("checked",true);
			}
		}
</script>
</html>
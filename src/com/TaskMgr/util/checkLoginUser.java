package com.TaskMgr.util;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class checkLoginUser extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = ServletActionContext.getRequest().getSession();
		System.out.println(ServletActionContext.getRequest().getRequestURI()+"dointerceptor");
		Object attr = session.getAttribute("userinfo");
		if(attr==null) {
			return "login";
		}else {
		return arg0.invoke();	
		}	
	}

}

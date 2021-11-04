package com.TaskMgr.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.*;
import net.sf.json.*;
import net.sf.json.JSONArray;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.TaskMgr.bean.SelectList;
import com.TaskMgr.bean.TaskList;
import com.TaskMgr.service.ITaskListService;
import com.TaskMgr.util.DateValueFilter;
import com.alibaba.fastjson.*;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TaskListAction {
	
	private ITaskListService tasklistservice;
	public void setTasklistservice(ITaskListService tasklistservice) {
		this.tasklistservice = tasklistservice;
	};
	

	private net.sf.json.JSONObject result;
	
	@SuppressWarnings("unused")
	public String taskform() {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("customerlist", tasklistservice.getSelectList("客户名称"));
	 	request.setAttribute("xtmclist", tasklistservice.getSelectList("系统名称"));
	 	request.setAttribute("stateslist", tasklistservice.getSelectList("处理状态"));	
	 	return "tasklist";
	}
	
	
	public net.sf.json.JSONObject getResult() {
		return result;
	}

	public void setResult(net.sf.json.JSONObject result) {
		this.result = result;
	}

	public String tasklist() throws ParseException {
		HttpServletRequest request = ServletActionContext.getRequest();	 	
		String customer = request.getParameter("custid");
		String xtmc = request.getParameter("xtid");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");		
		Date bdate = sdf.parse("2015-01-01");
		Date edate = sdf.parse("2021-12-30");
	//	Date bdate = sdf.parse(request.getParameter("bdate"));
	//	Date edate = sdf.parse(request.getParameter("edate"));
	 	List<TaskList> list =tasklistservice.findTaskList(customer==null?"%":customer,xtmc==null?"%":xtmc, bdate, edate);
	 	
	 	//Gson gs = new  GsonBuilder().serializeNulls().setDateFormat("yyyy-mm-dd").create();	 			 			 		 
	 	 JSONObject jo = new JSONObject();
	 	/*
	 	 * 将集合中的像属性为null/日期为null的转为空串
	 	 * 使用的是阿里的fastjson
	 	 * */
	 	  String resultstr =
	 	 "{\"total\":\"20\",\"records\":\"cc\",\"page\":\"aa\",\"rows\":"+jo.toJSONString(list,new DateValueFilter()) +"}";
	 	result  = net.sf.json.JSONObject.fromObject(resultstr) ; 
//	 	System.out.print(result);
	 	
		return "jsondata";
	}


}

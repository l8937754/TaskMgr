package com.TaskMgr.dao;

import java.util.Date;
import java.util.List;
import com.TaskMgr.bean.TaskList;
import com.TaskMgr.bean.SelectList;;

public interface ITaskList {
	public  List<TaskList> getTaskList(String customername,String xtmc,Date bdate,Date edate);
	public List<SelectList> getSelectList(String keytype);
	public List<String> getallCustomerlist();
}

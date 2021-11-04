package com.TaskMgr.service;

import java.util.Date;
import java.util.List;

import com.TaskMgr.bean.SelectList;
import com.TaskMgr.bean.TaskList;

public interface ITaskListService {
	public List<TaskList> findTaskList(String customername,String xtmc,Date bdate,Date edate);
	public List<SelectList> getSelectList(String keytype);
	public List<String> getAllCustomer();

}

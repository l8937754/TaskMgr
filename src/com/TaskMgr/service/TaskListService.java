package com.TaskMgr.service;

import java.util.Date;
import java.util.List;

import com.TaskMgr.bean.SelectList;
import com.TaskMgr.bean.TaskList;
import com.TaskMgr.dao.ITaskList;

public class TaskListService implements ITaskListService {

	private  ITaskList tasklistdao;
	public void setTasklistdao(ITaskList tasklist) {
		this.tasklistdao = tasklist;
	}
	@Override
	public List<TaskList> findTaskList(String customername, String xtmc, Date bdate, Date edate) {
		// TODO Auto-generated method stub
		return tasklistdao.getTaskList(customername, xtmc, bdate, edate);
	}
	@Override
	public List<String> getAllCustomer() {
		// TODO Auto-generated method stub
		return tasklistdao.getallCustomerlist();
	}
	@Override
	public List<SelectList> getSelectList(String keytype) {
		// TODO Auto-generated method stub
		return tasklistdao.getSelectList(keytype);
	}

}

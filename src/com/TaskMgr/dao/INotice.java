package com.TaskMgr.dao;

import java.util.List;

import com.TaskMgr.bean.Notice;

public interface INotice {
	public List<Notice> getalllist();
	public void save(Notice notice);
	public List findByPage(int [] noticePage);
}

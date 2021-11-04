package com.TaskMgr.service;

import java.util.List;

import com.TaskMgr.bean.Notice;

public interface INoticeServer {
	public List<Notice> findalllist();
	public void save(Notice notice);
	public List<Notice> findByPage(int pageNo,int pageSize);

}

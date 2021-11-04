package com.TaskMgr.service;

import java.util.List;

import com.TaskMgr.bean.Notice;
import com.TaskMgr.dao.INotice;

public class NoticeServerImpl implements INoticeServer {
	
	private INotice notice;
	public void setNotice(INotice notice) {
		this.notice=notice;
	}

	@Override
	public List<Notice> findalllist() {
		// TODO Auto-generated method stub
		return notice.getalllist();
	}

	@Override
	public void save(Notice notice) {
		// TODO Auto-generated method stub
		this.notice.save(notice);
	}

	@Override
	public List findByPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		int [] page = new int[2];
		page[0] = (pageNo-1)* pageSize;
		page[1] = pageSize;
		return this.notice.findByPage(page);
	}

}

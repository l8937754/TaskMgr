package com.TaskMgr.service;

import com.TaskMgr.dao.UsersDao;
import com.TaskMgr.bean.Users;

public interface UsersServer {
	public Users findoneuser(Users user);
}

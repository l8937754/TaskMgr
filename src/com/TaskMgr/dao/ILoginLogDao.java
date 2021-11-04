package com.TaskMgr.dao;

import java.util.List;

import com.TaskMgr.bean.Loginlog;
import com.TaskMgr.bean.Users;
public interface ILoginLogDao {
	
	public void save(Loginlog log);
	public List<Users> find_log(boolean first,Users user);
}

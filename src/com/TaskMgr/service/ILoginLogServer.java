package com.TaskMgr.service;

import java.util.List;

import com.TaskMgr.bean.Users;;

public interface ILoginLogServer {	
	public void save(Users user,String ip);
	public List<Users> find_first(Users user);
}

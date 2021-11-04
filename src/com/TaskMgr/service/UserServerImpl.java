package com.TaskMgr.service;

import com.TaskMgr.dao.UsersDao;
import com.TaskMgr.bean.Users;

public class UserServerImpl implements UsersServer{
	
	private UsersDao userdao;
	public void setUserdao(UsersDao ud) {
		this.userdao=ud;
	}
	
	@Override
	public Users findoneuser(Users user) {
		// TODO Auto-generated method stub
		return userdao.findoneuser(user);
	}

}

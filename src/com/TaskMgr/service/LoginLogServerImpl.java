package com.TaskMgr.service;

import java.util.Date;
import java.util.List;

import com.TaskMgr.bean.Loginlog;
import com.TaskMgr.dao.ILoginLogDao;
import com.TaskMgr.bean.Users;
import com.TaskMgr.util.*;

public class LoginLogServerImpl  implements ILoginLogServer{
			
	private ILoginLogDao logdao;
	public void setLogdao(ILoginLogDao logdao) {
		this.logdao=logdao;
	}

	@Override
	public void save(Users user,String ip) {
		// TODO Auto-generated method stub
		Loginlog log =new Loginlog();
		
		log.setId(PublicClass.getUUID());
		log.setLoginID(user.getID());
		log.setLoginName(user.getLOGINNAME());
		log.setLoginDateTime(new Date());
		log.setLoginIP(ip); 
		logdao.save(log);
		
 	}

	@Override
	public List<Users> find_first(Users user) {
		// TODO Auto-generated method stub
		return logdao.find_log(true, user);
	}

}

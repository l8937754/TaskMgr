package com.TaskMgr.dao;

import com.TaskMgr.bean.Loginlog;
import com.TaskMgr.bean.Users;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.QueryException;

public class LoginLogDaoImpl implements ILoginLogDao {

	private SessionFactory sessionFactory;
	private Session session;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		session = this.sessionFactory.openSession();
	}
	
	private Session getSession() {
		session = sessionFactory.openSession();
		return session;
	}
	
	@Override
	public void save(Loginlog log) {
		// TODO Auto-generated method stub
		
		getSession().save(log);
		session.beginTransaction().commit();
		session.close();
	}


	@Override
	public List<Users> find_log(boolean first,Users user) {
		// TODO Auto-generated method stub
		String str ="";
		 str = "from Loginlog where  loginid = ? and rownum =1 order by logindatetime desc";
		Query query = getSession().createQuery(str).setString(0, user.getID());
		List<Users> list = query.list();
		session.close();
		return list;
		
	}

}

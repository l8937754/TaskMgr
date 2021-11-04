package com.TaskMgr.dao;

import java.util.Date;
import java.util.List;
import com.TaskMgr.bean.SelectList;
import com.TaskMgr.bean.TaskList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

public class TaskListImpl implements ITaskList {

	private SessionFactory sessionFactory;
	private Session session;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getSession() {
		 
		 session= sessionFactory.openSession();
		 return session;
	}
	@Override
	public List<TaskList> getTaskList(String customername,String xtmc,Date bdate,Date edate) {
		// TODO Auto-generated method stub
		
		String sql = "from TaskList t where t.customername like ? and t.xtmc like ? and t.tcrq between ? and ? and rownum <=5";
		Query query = getSession().createQuery(sql).setString(0, customername).setString(1, xtmc).setParameter(2, bdate).setParameter(3, edate);
		List<TaskList> list = query.list();
		//System.out.println(list.size());
		session.close();
		return list;
	}
	@Override
	public List<String> getallCustomerlist() {
		// TODO Auto-generated method stub
		Query query =getSession().createQuery("select distinct t.customername from TaskList t");
		List<String> list = query.list();
		session.close();
		return list;
	}
	@Override
	public List<SelectList> getSelectList(String keytype) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from SelectList where tkey = ?").setParameter(0, keytype);
		List<SelectList> list =query.list();
		session.close();
		return list;
	}

}
